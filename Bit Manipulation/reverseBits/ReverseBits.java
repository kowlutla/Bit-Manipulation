/**
  	Reverse the bits of an 32 bit unsigned integer A.
  	
  	Example Input 1:
    A = 0
	Example Output 1:
	    0
	Explanation 1:
	        00000000000000000000000000000000  
	=>      00000000000000000000000000000000
	Example Input 2:
	    A = 3
	Example Output 2:
	    3221225472
	Explanation 2:
	          00000000000000000000000000000011 
	=>        11000000000000000000000000000000


 */
package reverseBits;

import java.util.Scanner;

/**
 * @author apiiit-rkv
 *
 */
public class ReverseBits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter number: ");
		int n=sc.nextInt();
		System.out.println("Original number: "+n);
		n=reverse(n);
		System.out.println("Number After reverigng bits: "+n);
		sc.close();
	}

	private static int reverse(int n) {
		
		int temp=n;
		int count=0;
		while(temp>0)
		{
			temp=temp>>1;
			count++;
		}
		
		return (n>>count | n << (31-count));
	}

}
