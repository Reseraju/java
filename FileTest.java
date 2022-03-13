
import java.util.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
public class FileTest {
	public static void main(String args[])throws IOException
	{
		Scanner sc=new Scanner(System.in);
	File fin=new File("Mynum.txt");
    if(fin.exists())
	  {
	  System.out.println("exists ");
	  }else
	  {
		fin.createNewFile();
		System.out.println("created");
	  }
		System.out.println("enter no.of elements : ");
        int n =sc.nextInt();
        //int [] a= new int[n];
        FileOutputStream fout = new FileOutputStream("mynum.txt");
        for(int i=0;i<n;i++){
            System.out.print("Enter the number "+i+":");
			int num=sc.nextInt();
            fout.write(num);
        }
		
		System.out.println("data added successfully");
        int i=0;
		//create new file input stream
		FileInputStream fin1 = new FileInputStream("mynum.txt");
		
		while((i=fin1.read())!=-1) 
		{
			System.out.print(i+" ");
		}
        try {
            FileOutputStream  fout = new FileOutputStream("content.txt");
               
             BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
             System.out.println("enter data");
             String s=br.readLine();
             //converting string to byte array
             byte[] arr = s.getBytes();
             fout.write(arr);
             System.out.println("data added");
             
            }
            catch (Exception e) 
            {
              System.out.println("File Not Found");
            }
            int i=0;
            // create new file input stream
            FileInputStream fin1 = new FileInputStream("content.txt");
                while((i=fin1.read())!=-1) 
            {
                //Converts Byte to Character
                char c = (char)i;
                System.out.print(c);
                }
            }
	}
    
}

