/**
 	Objective: Given a number N, write a program to find a complement number of the given number.
 	Flip all the bits of a number to get the complement of that number.
 	
 	Example: 

	N = 8
	Output: 7
	Explanation: 
	N = 8, binary representation: 1 0 0 0
	Flip all the bits = 0 1 1 1 => 7
	____________________________________
	N = 13
	Output: 2
	Explanation:
	N = 13, binary representation: 1 1 0 1
	Flip all the bits = 0 0 1 0 => 2  
  	
 */
package complements;

import java.util.Scanner;

/**
 * @author apiiit-rkv
 *
 */
public class ComplementBits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number: ");
		int n=sc.nextInt();
		int complement=complementBits(n);
		System.out.println("Complement of "+n+" is "+complement);
		
		complement=complementBits1(n);
		System.out.println("Complement of "+n+" is "+complement);
		sc.close();
	}

	private static int complementBits1(int n) {
		
		int mask=(Integer.highestOneBit(n)<<1)-1;
		return n^mask;
	}

	private static int complementBits(int n) {
		
		int msb=getMSB(n);
		int num=1;
		for(int i=1;i<=msb;i++)
		{
			num=num<<1;
			num=num|1;
		}
		return num^n;
	}

	private static int getMSB(int n) {
		
		int k=(int)(Math.log(n)/Math.log(2));
		return k;
	}

}
