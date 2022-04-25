import java.util.*;
import java.io.*;
public class newFile {
	public static void main(String args[])throws IOException
	{
		Scanner in=new Scanner(System.in);
	newFile f=new newFile();
	f.createNewFile();
	FileWriter W = new FileWriter("sample.txt");
	System.out.println("Enter the data you want to store in the file");
	String s=in.nextLine();
	W.write(s);
	W.close();
	
	
	
	newFile n=new newFile();
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
	
	//new contentriyhu 
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
