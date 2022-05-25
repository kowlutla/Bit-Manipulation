/**
  Objective: Given two integers, write an algorithm to calculate the hamming distance between the integers. 
  
  Hamming Distance: Hamming distance between two integers is the number of positions at which 
  the bits are different
  
  		X = 2, Y = 4
		Hamming distance: 2
		2 = 0 1 0
		4 = 1 0 0
		There are two positions at which bits are different.
		
		X = 4, Y = 5
		Hamming distance: 1
		4 = 1 0 0
		5 = 1 0 1
		There is only one position at which bit is different.
		
		X = 7, Y = 10
		Hamming distance: 3
		10 = 1 0 1 0
		7 =  0 1 1 1
		There are three positions at which bits are different.

 */
package hammingDistance;

import java.util.Scanner;

/**
 * @author apiiit-rkv
 *
 */
public class HammingDistance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number1: ");
		int m=sc.nextInt();
		System.out.print("Enter number2: ");
		int n=sc.nextInt();
		int hamming_distance=hammingDistance(m,n);
		System.out.println("Hamming distance of "+m+" and "+n+" : "+hamming_distance);
		sc.close();

	}

	private static int hammingDistance(int m, int n) {
		
		int xor=m^n;
		int count=0;
		while(xor>0)
		{
			if((xor&1)==1)
			{
				count++;
			}
			xor=xor>>1;
		}
		return count;
	}

}
