package swapOddEvenBits;

import java.util.Scanner;

public class SwapBits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number: ");
		int n=sc.nextInt();
		System.out.println("Original number: "+n);
		n=swapBits(n);
		System.out.println("After swapping bits: "+n);
		sc.close();
	}

	private static int swapBits(int n) {
		
		int even_bits=n&0xAAAAAAAA;
		int odd_bits=n&0x55555555;
		even_bits>>=1;
		odd_bits<<=1;
		
		return odd_bits|even_bits;
	}

}
