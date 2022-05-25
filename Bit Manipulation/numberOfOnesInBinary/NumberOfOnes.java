package numberOfOnesInBinary;

import java.util.Scanner;

public class NumberOfOnes {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number: ");
		int n=sc.nextInt();
		int count=countOnes(n);
		System.out.println("Ones in "+n+" is : "+count);
		sc.close();
	}

	private static int countOnes(int n) {
		int count=0;
		while(n>0)
		{
			count=count+(n & 1);
			n>>=1;
		}
		return count;
	}

}
