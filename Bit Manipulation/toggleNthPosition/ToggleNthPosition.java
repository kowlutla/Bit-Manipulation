package toggleNthPosition;

import java.util.Scanner;

public class ToggleNthPosition {

	

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number: ");
		int num=sc.nextInt();
		System.out.print("Enter position to set bit: ");
		int pos=sc.nextInt();
		System.out.println("Original Number: "+num);
		num=toggleNthPosition(num,pos);
		System.out.println("After toggling bit at "+pos+" position: "+num);
		sc.close();

	}

	private static int toggleNthPosition(int num, int pos) {
		
		num=num ^ (1<<(pos-1));
		return num;
	}

}
