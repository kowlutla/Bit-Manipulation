/**
 * 
 */
package playingWithCharacters;

import java.util.Scanner;

/**
 * @author apiiit-rkv
 * 
 * to convert lower case to upper case perform
 * AND operation between character and '_' (underscore);
 * 
 * Input: a		97:1100001
 * 		  _     95:1011111		
 * 		  &     -----------
 * OutPut: A:	65:1000001
 * 
 * 
 * to convert Upper case to Lower case perform
 * XOR operation between character and ' ' (space);
 * 
 * Input: A:	65:1000001
 * 		  ' ':  32:0100000		
 * 		  |    -----------
 * OutPut: a:	97:1100001
 * 
 *
 */
public class ChangeCase{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string with lowercase letter:");
		String s=sc.nextLine();
		String s1="";
		System.out.println("Original message: "+s);
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c>='A' && c<='Z')
			{
				s1=s1+(char)(c^' ');
			}
			else if(c>='a' && c<='z')
			{
				s1=s1+(char)(c&'_');
			}
			else
			{
				s1+=c;
			}
		}
		System.out.println("After change case: "+s1);
		sc.close();
	}

}
