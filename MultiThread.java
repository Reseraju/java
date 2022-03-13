import java.util.Random;
import java.util.LinkedList;
import java.util.Queue;

class RandomNumber extends Thread{
    Queue<Integer> sharedListObj =  new LinkedList<Integer>();
    RandomNumber(Queue<Integer> sharedListObj){
		this.sharedListObj = sharedListObj;
	}
    public void run(){
        Random randam = new Random();
        while(true){
            synchronized(sharedListObj){
                int rand_int1 = randam.nextInt(1000);
                System.out.println("random number :"+rand_int1);
                sharedListObj.notifyAll();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                sharedListObj.notifyAll();
            }
        }
        
    }
}

class SquareThread extends Thread{
    Queue<Integer> sharedListObj ;
    int x;
    SquareThread(Queue<Integer> sharedListObj ){
        this.sharedListObj=sharedListObj;
    }
    public void run(){
        while(true){
            synchronized(sharedListObj){
                while(sharedListObj.size()<1 || sharedListObj.element()%2!=0){
                    try {
                        sharedListObj.wait();
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
                x = this.sharedListObj.remove();
                int sqr=x*x;
                System.out.println("Square of "+x+" = "+sqr);
                sharedListObj.notifyAll();
            }
        }

    }
}
class CubeThread extends Thread{
    Queue<Integer> sharedListObj ;
    int x;
    CubeThread(Queue<Integer> sharedListObj){
        this.sharedListObj=sharedListObj;
    }
    public void run(){
        while(true){
            synchronized(sharedListObj){
                while(sharedListObj.size()<1||sharedListObj.element()%2==0){
                    try {
                        sharedListObj.wait();
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
                x = this.sharedListObj.remove();
                int cube=x*x*x;
                System.out.println("Cube of "+x+" = "+cube);
                sharedListObj.notifyAll();

            }
        }
    }
}



public class MultiThread {
    public static void main(String[] args) {
        Queue<Integer> sharedListObj =  new LinkedList<Integer>();
        Thread random = new Thread(new RandomNumber(sharedListObj),"Random Therad");
        Thread squareThread = new Thread(new SquareThread(sharedListObj),"Square Thread");
		Thread cubeThread = new Thread(new CubeThread(sharedListObj),"Cube Thread");
        random.start();
        squareThread.start();
        cubeThread.start();
        
    }
}
