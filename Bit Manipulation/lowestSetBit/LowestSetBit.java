package lowestSetBit;

import java.util.Scanner;

public class LowestSetBit {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number: ");
		int n=sc.nextInt();
		System.out.println("Original number: "+n);
		int bit=lowestSet(n);
		System.out.println("Lowest set bit present at "+bit);
		sc.close();
	}

	private static int lowestSet(int n) {
	
		int bit=n&(-n);
		return bit;
	}

}
