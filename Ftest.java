
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ftest{
    public static void main(String [] args) throws IOException{
        System.out.println("enter the name of the file :");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        File f = new File(name);
        f.createNewFile();

        System.out.println("File name : "+f.getName());
        System.out.println("File Path : "+f.getPath());
        System.out.println("Absolute Path :"+f.getAbsolutePath());
        System.out.println("parent :"+f.getParent());
        System.out.println("Exists : "+f.exists());
        if(f.exists()){
            System.out.println("Is writeable : "+f.canWrite());
            System.out.println("Is Readeable : "+f.canRead());
            System.out.println("Is a directory : "+f.isDirectory());
        }
        sc.close();
    }
}