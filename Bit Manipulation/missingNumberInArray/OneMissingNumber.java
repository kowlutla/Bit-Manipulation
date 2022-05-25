package missingNumberInArray;

import java.util.Scanner;


//Given an array containing of all the numbers from 1 to n except one
// find the missing number
//[1,2,4,5] =>3 

public class OneMissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner  sc=new Scanner(System.in);
		System.out.print("Enter last number in sequence : ");
		int n=sc.nextInt();
		int array[]=new int[n-1];
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
		int missingnumber=missingNumber(array,n);
		System.out.println("\nMissing Number: "+missingnumber);
		sc.close();
	}

	private static int missingNumber(int[] array, int n) {
		
		int actualxor=0,arrayxor=0;
		for(int i=1;i<=n;i++)
		{
			actualxor^=i;
		}
		for(int i=0;i<array.length;i++)
		{
			arrayxor^=array[i];
		}
		return arrayxor^actualxor;
	}

}



