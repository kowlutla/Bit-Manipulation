package rotateBits;

import java.util.Scanner;

public class RotateBits {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number: ");
		int n=sc.nextInt();
		System.out.print("Enter no of bits to rotate: ");
		int k=sc.nextInt();
		System.out.println("Original Number: "+n);
		n=rotateClockWise(n,k);
		System.out.print("After rotating "+k+" bits in clockwise direction: "+n);
		sc.close();
	}
	static private int MAX_BITS_INTEGER=32;
	private static int rotateClockWise(int n, int k) {
		
		return (n>>k | n << (MAX_BITS_INTEGER-k));
		
	}

}
