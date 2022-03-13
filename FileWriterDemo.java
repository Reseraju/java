
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;

public class FileWriterDemo {
    public static void main(String[] args) throws IOException {
        FileWriter fw= new FileWriter("output.txt",true); //if we give 'true' parameter then it will append and not overwrite
        String text="this is a new text in demo";
        fw.write(text);
        fw.close();
        FileReader fr=new FileReader("output.txt");
        char [] input =new char[100];
        fr.read(input);
    }
        
    

}
