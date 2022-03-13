//Write a Java Program that finds the highest integer in the list without using sort method
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class HighestElement {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("enter 10 elements into the list :");
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<10;i++){
            list.add(sc.nextInt());
        }
        System.out.println(list);
        int largestElement= list.get(0);
        Iterator<Integer> iterator = list.iterator();
        // while(iterator.hasNext()){
        //     int element=iterator.next();
        //     if(largestElement < element){
        //         largestElement = element;
        //     }
        // }

        for(int i=0;i<10;i++){
            int element= iterator.next();
            if(largestElement< element){
                largestElement=element;
            }
        }
        System.out.println("The largest element is : "+largestElement);
    }
}
