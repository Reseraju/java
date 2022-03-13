
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo{
     public static void main(String[] args) throws FileNotFoundException,IOException{
        FileReader fr = new FileReader("input.txt");
        char [] content=new char[100];
        fr.read(content);
        System.out.println(content);
        fr.close();
    }
}
