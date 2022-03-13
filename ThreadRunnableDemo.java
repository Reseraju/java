class RunnableThreadDemo implements Runnable{
    public void run(){
        System.out.println("Thread in runnable Interface");
    }
}


public class ThreadRunnableDemo {
    public static void main(String[] args) {
        RunnableThreadDemo thread = new RunnableThreadDemo();
        Thread newThread = new Thread(thread);
        newThread.start();
    }
}
