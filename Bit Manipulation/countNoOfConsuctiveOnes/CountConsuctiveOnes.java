/**
 * Count maximum number of consecutive 1's in Binary tree
 */
package countNoOfConsuctiveOnes;

import java.util.Scanner;

/**
 * @author apiiit-rkv
 *
 */
public class CountConsuctiveOnes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number: ");
		int n=sc.nextInt();
		System.out.println("Maximum no of Consuctive 1's in Binary number: "+n+" is: "+getMaxConsecutive(n));
		sc.close();

	}

	//Time Complexity:O(k) k:length of longest consecutive 1's
	//space Complexity:O(1)
	private static int getMaxConsecutive(int n) {
		int count=0;
		
		while(n>0)
		{
			n=n&(n>>1);
			count++;
			
		}
		
		
		return count;
	
	}

}
