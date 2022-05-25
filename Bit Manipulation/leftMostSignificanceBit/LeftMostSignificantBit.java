/**
 Given a number, find the most significant bit number which is set bit and which is in power of two
 
  Examples:

	Input : 10
	Output : 8
	Binary representation of 10 is 1010
	The most significant bit corresponds
	to decimal number 8.
	
	Input : 18
	Output : 16

 */
package leftMostSignificanceBit;

import java.util.Scanner;

/**
 * @author apiiit-rkv
 *
 */
public class LeftMostSignificantBit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number : ");
		int n=sc.nextInt();
		int msb=leftMostSignificantBit(n);
		System.out.println("Left most significant bit is: "+msb);
		sc.close();

	}

	private static int leftMostSignificantBit(int n) {
		
		n=n|n>>1;
		n=n|n>>2;
		n=n|n>>4;
		n=n|n>>8;
		n=n|n>>16;
		n=n+1;
		return n>>1;
		
	}

}
