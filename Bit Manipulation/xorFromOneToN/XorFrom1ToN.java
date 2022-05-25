package xorFromOneToN;

import java.util.Scanner;

public class XorFrom1ToN {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number: ");
		int n=sc.nextInt();
		
		int xor=getXor1(n);
		
		System.out.println("Xor from 1 to "+n+" is: "+xor);
		xor=getXor2(n);
		System.out.println("Xor from 1 to "+n+" is: "+xor);
		sc.close();
	}

	private static int getXor1(int n) {
		
		int xor=0;
		for(int i=1;i<=n;i++)
		{
			xor^=i;
		}
		return xor;
	}
	
	private static int getXor2(int n)
	{
		if(n%4==0)
		{
			return n;
		}
		if(n%4==1)
		{
			return 1;
		}
		if(n%4==2)
		{
			return n+1;
		}
		else
		{
			return 0;
		}
	}

}
