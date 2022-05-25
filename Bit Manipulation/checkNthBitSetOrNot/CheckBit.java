package checkNthBitSetOrNot;

import java.util.Scanner;

public class CheckBit {

	public static void main(String[] args) {
		

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number: ");
		int num=sc.nextInt();
		System.out.print("Enter position to set bit: ");
		int pos=sc.nextInt();
		System.out.println("Original Number: "+num);
		checkSetBit1(num,pos);
		checkSetBit2(num,pos);
		sc.close();

	}
	
	//Using leftShift
	private static void checkSetBit1(int num, int pos) {
		
		
		if((num & (1 << (pos - 1))) != 0)
		{
			System.out.println("SET");
		}
		else
		{
			System.out.println("NOT SET");
		}
	}
	
	//Using Right Shift
	private static void checkSetBit2(int num,int pos)
	{
		if((1&(num >> (pos-1)))==1)
		{
			System.out.println("set");
		}
		else
		{
			System.out.println("not set");
		}
	}

}
