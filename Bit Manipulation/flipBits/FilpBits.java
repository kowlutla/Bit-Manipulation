/**
 * 
 */
package flipBits;

import java.util.Scanner;

/**
 * @author apiiit-rkv
 * No of bits needed to  be flipped to convert given number
 * to another 
 * Input: N:65	M:80 
 * Output: 2
 * 
 * Explanation: 65: 01000001
 * 				80: 01010000
 *		fliped bits:   f   f ==> 2bits	
 *
 */
public class FilpBits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number1: ");
		int n=sc.nextInt();
		System.out.print("Enter number2: ");
		int m=sc.nextInt();
		int count_flips=countFlips(n,m);
		System.out.println("No of bits to be flipped to convert "+n+" to "+m);
		System.out.println(count_flips);
		sc.close();

	}

	private static int countFlips(int n, int m) {
		
		int temp=m^n;
		
		int count=0;
		while(temp>0)
		{
			if((temp&1)==1)
			{
				count++;
			}
			temp=temp>>1;
		}
		return count;
	}

}
