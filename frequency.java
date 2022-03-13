import java.util.Scanner;
public class frequency {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i,count=0;
        String str;
        System.out.println("enter the string : ");
        str=sc.next();
        System.out.println("enter the charector of which the frquency to be calculated : ");
        char ch = sc.next().charAt(0);
        for(i=0;i<str.length();i++){
            if(str.charAt(i)==ch){
                count++;
            }
        }
        if(count==0){
            System.out.println("No such character found");
        }
        else{
            System.out.println("The Frequency is : "+count);
        }
        
    }
}
