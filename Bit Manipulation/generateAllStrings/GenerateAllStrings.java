/**
	Generate All Strings of n bits.
	
	 Objec­tive: – Generate All Strings of n bits, consider A[0..n-1] is an array of size n.
	 
	 n = 3
	Output:
	[0, 0, 0]    [1, 0, 0]    [0, 1, 0]    [1, 1, 0]
	
	[0, 0, 1]     [1, 0, 1]     [0, 1, 1]    [1, 1, 1]
 */
package generateAllStrings;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author apiiit-rkv
 *
 */
public class GenerateAllStrings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no of bits: ");
		int n=sc.nextInt();
		generateStrings(n);
		sc.close();
	}
	
	
	
	
//	
//	private static void generateStrings1(int n) {
//		
//		for(int i=0;i<Math.pow(2,n);i++)
//		{
//			System.out.println(Integer.toBinaryString(i));
//		}
//		
//	}





	private static void generateStrings(int n)
	{
		int array[]=new int[n];
		generateStrings(n,array);
	}

	private static void generateStrings(int n,int array[]) {
		if(n<=0)
			System.out.println(Arrays.toString(array));
		else
		{
			array[n-1]=0;
			generateStrings(n-1,array);
			array[n-1]=1;
			generateStrings(n-1,array);
		}
	}

}
