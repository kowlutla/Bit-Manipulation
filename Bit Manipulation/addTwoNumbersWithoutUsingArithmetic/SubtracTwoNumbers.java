package addTwoNumbersWithoutUsingArithmetic;

import java.util.Scanner;

public class SubtracTwoNumbers {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter A: ");
		int a=sc.nextInt();
		System.out.print("Enter B: ");
		int b=sc.nextInt();
		int sub=subtract1(a,b);
		System.out.print(a+"-"+b+" = "+sub);
		sub=subtract(a,b);
		System.out.println();
		System.out.print(a+"-"+b+" = "+sub);
		sc.close();

	}
	
	//using recursion
	private static int subtract1(int a, int b) {
		
		if(b==0)
		{
			return a;
		}
		int barrow=~a&b;
		a=a^b;
		return subtract1(a,(barrow<<1));
	}

	//without recursion
	private static int subtract(int a,int b)
	{
		while(b!=0)
		{
			int barrow=~a&b;
			a=a^b;
			b=barrow<<1;
		}
		return a;
	}

}
