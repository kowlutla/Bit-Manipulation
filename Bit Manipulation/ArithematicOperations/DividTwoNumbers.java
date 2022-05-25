/**
  Divide two integers without using multiplication, division and modulo operator
  
	Input : a = 10, b = 3
	Output : 3
	
	Input : a = 43, b = -8
	Output :  -5
  
 */
package ArithematicOperations;

import java.util.Scanner;

/**
 * @author apiiit-rkv
 *
 */
public class DividTwoNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter dividend: ");
		int dividend=sc.nextInt();
		System.out.print("Enter divisor: ");
		int divisor=sc.nextInt();
		
		int quotient=divid(dividend,divisor);
		
		System.out.println("Quotient: "+quotient);
		sc.close();
		

	}

	private static int divid(int dividend, int divisor) {
		
		int sign;
		if(dividend<0 ^ divisor<0)
		{
			sign=-1;
		}
		else
		{
			sign=1;
		}
		
		
		dividend=Math.abs(dividend);
		divisor=Math.abs(divisor);
		int quotient=0;
		while(divisor<=dividend)
		{
			quotient++;
			dividend-=divisor;
		}	
		return quotient*sign;
	}
}
