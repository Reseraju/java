

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FilterReader;
import java.io.IOException;


public class FileLineCount {
    public static void main(String[] args) {
        FileLineCount count =new FileLineCount();
        int noOfLines = count.countLine("input.txt");
        System.out.println("no of lines in the given text file :"+noOfLines);
    }

    int countLine(String filename) throws IOException,FileNotFoundException{
        BufferedReader in=null;
        int lineCount=0;
        
        in=new BufferedReader(new FileReader(fileName)); //buffered is used to utilize the next method 
        String line = in.readLine();
        while(line!=null){
            lineCount++;
            line=in.readLine();
        }
        in.close();
        return lineCount;

       
    }
}
