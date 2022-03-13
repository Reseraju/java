class DemoThread extends Thread{
    public void run(){
        System.out.println("Thread Running");
    }
}


public class ThreadDemo {
    public static void main(String [] args) {
        DemoThread thread =new DemoThread(); //dreating the thread
        thread.setName("Demo"); //setting a name
        
        System.out.println("Thread State : "+thread.getState());
        thread.start(); //changing state from new to runnable
        System.out.println("Thread State : "+thread.getState());
        System.out.println("Thread Name : "+thread.getName());
        System.out.println("Thread priority "+thread.getPriority());
        thread.setPriority(4);
        System.out.println("Thread priority "+thread.getPriority());
        
    }
}
