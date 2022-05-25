/**
 * 
 */
package equalSumXor;

import java.util.Scanner;

/**
 * @author apiiit-rkv
 *  Input  : n = 7
	Output : 1
	Explanation:
	7^i = 7+i holds only for only for i = 0
	7+0 = 7^0 = 7
 *
 */
public class EqualSumXor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number: ");
		int n=sc.nextInt();
		
		int xor=method1(n);
		
		System.out.println("Xor from 1 to "+n+" is: "+xor);
		xor=method2(n);
		System.out.println("Xor from 1 to "+n+" is: "+xor);
		sc.close();

	}

	private static int method2(int n) {
		
		int unsetbit=0;
		while(n>0)
		{
			if((n & 1)==0)
			{
				unsetbit++;
			}
			n=n>>1;
		}
		return 1<<unsetbit;
	}

	//Time complexity:O(n)
	private static int method1(int n) {
		
		int count=0;
		for(int i=0;i<=n;i++)
		{
			if(n+i==(n^i))
			{
				count++;
			}
		}
		return count;
	}

}
