import java.util.LinkedList;
import java.util.Queue;

public class ProdConDemo {

	public static void main(String[] args) {
		Queue<Integer> sharedListObj =  new LinkedList<Integer>();
		Thread producer = new Thread(new ProdClass(sharedListObj),"Producer Thread");
		Thread consumer = new Thread(new ConClass(sharedListObj),"Consumer Thread");
		producer.start();
		consumer.start();
	}

}
//Producer
class ProdClass implements Runnable{
	Queue<Integer> sharedListObj;
	//Constructor
	ProdClass(Queue<Integer> sharedListObj){
		this.sharedListObj = sharedListObj;
	}
	public void run() {
		int item=0;
		while(true) {
		synchronized (sharedListObj) {
			while(sharedListObj.size()>=5) {
				try {
					System.out.println("Queue Full");
					sharedListObj.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
				//Putting value in the list
				System.out.println(Thread.currentThread().getName()+" "+"Adding to Queue: "+ ++item);
				sharedListObj.add(item);
				sharedListObj.notify();//Notify Consumer
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			
		}
			
		}
	}
}
//Consumer
class ConClass implements Runnable{
	Queue<Integer> sharedListObj;
	ConClass(Queue<Integer> sharedListObj){
		this.sharedListObj = sharedListObj;
	}
	public void run() {
		while(true) {
			synchronized (sharedListObj) {
				while(sharedListObj.size()<1) {
					try {
						System.out.println("Queue Empty");
						sharedListObj.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				int val = sharedListObj.remove();
				System.out.println(Thread.currentThread().getName()+ " "+"Getting from queue "+val);
				sharedListObj.notify();//Notify Producer
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
}