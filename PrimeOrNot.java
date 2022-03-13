import java.util.Scanner;

public class PrimeOrNot{
    public static void main(String [] args){
        try (Scanner sc = new Scanner(System.in)) {
            int limit,i,j;
            System.out.print("enter the limit : " );
            limit = sc.nextInt();
            for(i=2;i<=limit;i++){
                int flag=0;
                for(j=2;j<=i/2;j++){
                    if(i%j==0){
                        flag=1;
                    }
                }
                if(flag==0){
                    System.out.println(i);
                }
            }
            sc.close();
        }
    }
}