package unsetBitAtNthPosition;

import java.util.Scanner;

public class UnsetBit {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number: ");
		int num=sc.nextInt();
		System.out.print("Enter position to set bit: ");
		int pos=sc.nextInt();
		System.out.println("Original Number: "+num);
		num=unsetBitAtNthPosition(num,pos);
		System.out.println("After unset bit at "+pos+" position: "+num);
		sc.close();
	}

	private static int unsetBitAtNthPosition(int num, int pos) {
		
		num=num & (~(1<<(pos-1)));
		return num;
	}

}
