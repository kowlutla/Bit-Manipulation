package setBitAtNthPosition;

import java.util.Scanner;

public class SetBitAtNth {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number: ");
		int num=sc.nextInt();
		System.out.print("Enter position to set bit: ");
		int pos=sc.nextInt();
		System.out.println("Original Number: "+num);
		num=setBitAtNthPosition(num,pos);
		System.out.println("After set bit at "+pos+" position: "+num);
		sc.close();
	}

	private static int setBitAtNthPosition(int num, int pos) {
		
		num=num|(1<<(pos-1));
		return num;
	}

}




//number: 4 - output: 100		number - 5 - output: 101
//position:3 - output: 1100		position:1 - output: 111
