package swapTwoVariables;

import java.util.Scanner;

public class SwapTwovariables {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a: ");
		int a=sc.nextInt();
		System.out.print("Enter b: ");
		int b=sc.nextInt();
		System.out.println("Original numbers:  ");
		System.out.println("a: "+a+" b: "+b);
		System.out.println("After Swaping: ");
		swap(a,b);
				//System.out.println("a: "+a+" b: "+b);
		sc.close();
	}

	private static void swap(int a, int b) {
	
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("a: "+a+" b: "+b);

	}

}
