
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileSentenceCount {
    public static void main(String [] args ) throws FileNotFoundException,IOException{
        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        int sentenceCount =0;
        String line;
        String delimiters ="?!.";
        line = reader.readLine();
        while(line!=null){
            System.out.println("while");
            for(int i=0;i<line.length();i++){
                if(delimiters.indexOf(line.charAt(i))!=-1){ //indexOf - first occurence of a character
                    sentenceCount++;

                }
                line = reader.readLine();
            }
        }
        System.out.println("no of Sentences in the given text file : "+sentenceCount);
        reader.close();
    }
}
