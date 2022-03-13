import java.util.Scanner;
public class StringPalindrome{
    public static void main(String[] args ){
        int i,j,flag=0;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter a string : ");
            String str = sc.next();
            System.out.println("the string is :"+str);
            //String temp = str;
            int len = str.length();
            for(i=0,j=len-1;i<len/2;i++,j--){
                    if(str.charAt(i)==str.charAt(j)){
                        flag=1;
                    }
            }
            if(flag==1){
                System.out.println("the given string "+str+" is a palindrome");
            }
            else{
                System.out.println("the given string "+str+" is not a palindrome");
            }
        }
        
    }
}