/**
 * 
 */
package ArithematicOperations;

import java.util.Scanner;

/**
 * @author kowlutla
 *
 */
public class AddTwoNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("a: ");
		int a=sc.nextInt();
		System.out.print("b: ");
		int b=sc.nextInt();
		System.out.println("a: "+a+"\tb: "+b);
		System.out.println("Sum: "+a+" + "+b+" = "+sum(a,b));
		sc.close();
	}

	private static int sum(int a, int b) {
		
		if(b==0)
		{
			return a;
		}
		int partialsum=a^b;
		int carry=(a&b)<<1;
		return sum(partialsum,carry);
	}

}
