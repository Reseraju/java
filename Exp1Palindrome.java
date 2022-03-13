/*********************************************************
*            Author  - Rese Raju                         * *           										 *
*            Name    - Exp1Palindrome    				 *                            *												 *
*            version - 1.0             				 *                              *												 *
*            Date    - 26/11/21 						 *                                     *												 *
*********************************************************/
import java.util.Scanner;

class Str{
	String myString;
	
	boolean checkPalindrome(String string,int length) {
		boolean palindrome =true;
		for(int i=0;i<length/2;i++) {
			if(string.charAt(i)!=string.charAt(length-1-i)) {
				palindrome=false;
			}
		}
		return palindrome;
	}
}
public class Exp1Palindrome {
	
	
	public static void main(String arg[]) {
		System.out.print("Enter the string :- ");
		Scanner sc = new Scanner(System.in);
		Str str = new Str();
		str.myString= sc.next();
		sc.close();
		int strLeng=str.myString.length();
		boolean palindrome = str.checkPalindrome(str.myString,strLeng);
		if(palindrome) {
			System.out.println(str.myString + "is a palindrome string");
		}
		else {
			System.out.println(str.myString + "is not a palindrome string");
		}
		System.out.println("________________________________________");
	}
	
}
