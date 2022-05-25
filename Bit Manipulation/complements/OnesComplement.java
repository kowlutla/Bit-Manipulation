package complements;

import java.util.Scanner;

//Inverting all bits in a number 

public class OnesComplement {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter number: ");
		int n=sc.nextInt();
		System.out.println("Original number: "+n);
		System.out.println("1's Complement: "+(~n));
		sc.close();
	}

}


