


import java.io.FileInputStream;
import java.io.IOException;



public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("MyFile.txt");
        int i;
        while((i = fis.read())!=-1){
            System.out.println((char) i);
        }
        fis.close();
    }
}
