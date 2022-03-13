
import java.util.*;
import java.io.*;
public class File {
	public static void main(String args[])throws IOException
	{
		Scanner in=new Scanner(System.in);
	File f=new File();
	f.createNewFile();
	FileWriter W = new FileWriter("sample.txt");
	System.out.println("Enter the data you want to store in the file");
	String s=in.nextLine();
	W.write(s); // method writing content into a file
	W.close();
	
	
	
	File n=new File();
	n.createNewFile();
	FileReader fr = new FileReader("sample.txt");
    FileWriter  fw=new FileWriter("new-sample.txt",true);
	

	int c;  
	while ((c = fr.read()) != -1) {  
	 fw.write(c);  
	}  
	System.out.println("Copy finish...");  
	fr.close();  
	fw.close(); 
	
	//new content
	FileReader fq = new FileReader("new-sample.txt");
	BufferedReader b=new BufferedReader(fq);
	String str;
	while((str=b.readLine()) != null)
	{
	
	System.out.print(str);
	}
	fq.close();


}

	private void createNewFile() {
		
		
	}
}
