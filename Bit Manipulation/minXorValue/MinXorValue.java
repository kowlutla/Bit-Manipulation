/**
 Given an integer array A of N integers, find the pair of integers in the array which have minimum XOR value.
  Report the minimum XOR value.
  
   Example: 
   
   		Example Input 1:
		    A = [0, 2, 5, 7]
		Example Output 1:
		    2
		Explanation:
		    0 xor 2 = 2
		Example Input 2:
		    A = [0, 4, 7, 9]
		Example Output 2:
		    3
 */
package minXorValue;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author apiiit-rkv
 *
 */
public class MinXorValue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter array size: ");
		int n=sc.nextInt();
		int array[]=new int[n];
		System.out.println("Enter elements into array: ");
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		
		minXor(array);
		minXor1(array);
		sc.close();

	}

	private static void minXor(int[] array) {
		
		int minxor = Integer.MAX_VALUE;
		for(int i=0;i<array.length;i++)
		{
			//int xor=array[i];
			for(int j=i+1;j<array.length;j++)
			{
				minxor=Math.min(minxor,array[i]^array[j]);
			}
		}
		
		System.out.println("Minimum xor: "+minxor);
		
	}
	
	
	private static void minXor1(int[]array)
	{
		Arrays.parallelSort(array);
		int xor=Integer.MAX_VALUE;
		for(int i=0;i<array.length-1;i++)
		{
			xor=Math.min(xor, array[i]^array[i+1]);
		}
		System.out.println("Minimum Xor: "+xor);
	}
	

}
