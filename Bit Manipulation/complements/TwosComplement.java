package complements;

import java.util.Scanner;
//Change the sign of number
//n=123 =>-123
//n=-324 =>324

public class TwosComplement {

	public static void main(String[] args) {
	

		Scanner sc=new Scanner (System.in);
		System.out.print("Enter number: ");
		int n=sc.nextInt();
		System.out.println("Original number: "+n);
		System.out.println("2's Complement: "+(~n+1));

		sc.close();
	}

}
