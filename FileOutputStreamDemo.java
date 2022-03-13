

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.FileInputStream;


public class FileOutputStreamDemo  {
    public static void main(String[] args) throws IOException ,FileNotFoundException {
        String content = "this is a content.... ";
        FileOutputStream fos = new FileOutputStream("MyFile.txt");
        byte[] bytesArray = content.getBytes();
        fos.write(bytesArray);
        //fos.flush();
        System.out.println("File written succesfully");
        fos.close();
        FileInputStream fis= new FileInputStream("input.txt");
    }
}
