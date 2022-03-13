//generate an even and odd thread
//pre university question
//Q.Write a java program to create two threads, one for writing odd numbers and
//another for writing even numbers up to 100 into two different files.

import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;

class Odd extends Thread{

    public void run() {
        try {
            FileWriter frOdd = new FileWriter("odd.txt");
            for(int i=1;i<=20;i+=2){
                frOdd.write(i);
                
            }
            frOdd.close();
        } catch (IOException e) {
            
            e.printStackTrace();
        }
        
    }
}

class Even extends Thread{
    public void run(){
        try {
            FileWriter frEven = new FileWriter("even.txt");
            for(int i=1;i<=20;i+=2){
                frEven.write(i);
                
            }
            frEven.close();
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
    }
}

public class MultipleThreadDemo {
    public static void main(String[] args) throws IOException {
        Odd oddThread =new Odd();
        Even evenThread = new Even();
        //Multiple Thread
        oddThread.start();
        evenThread.start();
        FileReader fr = new FileReader("odd.txt");
        fr.close();
    }
}
