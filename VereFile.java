import java.io.*;
public class FEx2{
public static void main(String [] args) throws IOException 
{
// create new file input stream
FileInputStream fin = new FileInputStream("test.txt");
while((i=fin.read())!=-1) {
//Converts Byte to Character
char c = (char)i;
System.out.print(c);
}
}

}