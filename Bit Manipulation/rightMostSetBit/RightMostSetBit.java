/**
 * 
 */
package rightMostSetBit;

import java.util.Scanner;

/**
 * @author apiiit-rkv
 *
 */
public class RightMostSetBit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number: ");
		int n=sc.nextInt();
		System.out.println("Right Most set bit of "+n+" is: "+rightMostSetBit(n));
		sc.close();
	}

	private static int rightMostSetBit(int n) {
	
		
		int pos=0;
		n=n^(n&(n-1));
		while(n!=0)
		{
			pos++;
			n=n>>1;
		}
		return pos;
	}

}
