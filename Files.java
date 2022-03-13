import java.io.*;
public class Files{

 public static void main(String[] args) throws IOException 
    
 { 
	try { 
		FileOutputStream fout = new FileOutputStream("sample.txt",true);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		 System.out.println("enter data");
		 String s=br.readLine();
		 char ch[] = s.toCharArray();
		 for (int i = 0; i < s.length(); i++)
		 {
		 fout.write(ch[i]); 
		 }
		 fout.close();
	}
	catch (Exception e) 
	{
	System.out.println("File Not Found");
	}
	try{
	FileOutputStream fout = new FileOutputStream("new-sample.txt");
	int i=0;
	FileInputStream fin = new FileInputStream("sample.txt");
	while((i=fin.read())!=-1) {
	char c = (char)i;
	fout.write(c);
 }  fin.close();
 fout.close();}  
	catch (Exception e)
	{
		System.out.println("File Not Found");}
	int j=0;
	FileInputStream fin = new FileInputStream("new-sample.txt");
	System.out.println("Contents of 'new-sample' :");
	while((j=fin.read())!=-1) {
		char c = (char)j;
		System.out.print(c);
	}fin.close();
	}
}
