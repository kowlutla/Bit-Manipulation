package removeLeastSetBIt;

import java.util.Scanner;

public class StrippingOff {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number: ");
		int n=sc.nextInt();
		System.out.println("Original number: "+n);
		n=strippingOff(n);
		System.out.println("After removing least set bit: "+n);
		sc.close();

	}

	private static int strippingOff(int n) {
		
		return n & (n-1);
	}

}
