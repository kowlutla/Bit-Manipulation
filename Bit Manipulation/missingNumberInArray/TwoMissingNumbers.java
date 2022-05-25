/**
 * 
 */
package missingNumberInArray;

import java.util.Scanner;

/**
 * @author kowlutla
 *
 */
public class TwoMissingNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner  sc=new Scanner(System.in);
		System.out.print("Enter last number in sequence : ");
		int n=sc.nextInt();
		int array[]=new int[n-2];
		System.out.println("Enter the elements into sequence: ");
		for(int i=0;i<array.length;i++)
		{
			array[i]=sc.nextInt();
		}
		System.out.println("Sequence: ");
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
		
		System.out.print("\nTwo Missing Numbers: \n");
		int missingnumber[]=twoMissingNumbers(array,n);
		System.out.println("First Missing Number: "+missingnumber[0]);
		System.out.println("Second Missing Number: "+missingnumber[1]);
		sc.close();

	}

	private static int[] twoMissingNumbers(int[] array, int n) {
		
		long actualsum=0,arraysum=0;
//		for(int i=1;i<=n;i++)
//		{
//			actualxor^=i;
//		}
		actualsum=n*(n+1)/2;
		
		for(int i=0;i<array.length;i++)
		{
			arraysum+=array[i];
			
		}
		int pivot=(int)(actualsum-arraysum)/2;
		
//		System.out.println("Mid: "+pivot);
		
		int leftxor=0,leftarrayxor=0,rightxor=0,rightarrayxor=0;
		
		for(int i=1;i<=pivot;i++)
		{
			leftxor^=i;
		}
		
		for(int i=pivot+1;i<=n;i++)
		{
			rightxor^=i;
		}
		for(int i=0;i<array.length;i++)
		{
			if(array[i]<=pivot)
			{
				leftarrayxor^=array[i];
			}
			else
			{
				rightarrayxor^=array[i];
			}
		}
		
		return new int[] {leftarrayxor^leftxor,rightarrayxor^rightxor};
		
	}

}
