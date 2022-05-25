package basics;

import java.util.Scanner;

public class BitManipulationBasics {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a: ");
		int a = sc.nextInt();
		System.out.print("Enter b: ");
		int b = sc.nextInt();
		System.out.print("Original Numbers : ");
		System.out.println("a: " + a + "\tb: " + b);
		System.out.println("a & b : "+(a&b));
		System.out.println("a | b : "+(a|b));
		System.out.println("a ^ b : "+(a^b));
		System.out.println("~ a : "+(~a));
		System.out.println("a < < 1 : "+(a<<1));
		System.out.println("a > > 1 : "+(a>>1));
		sc.close();
	}

}

//a:5	b:8
//5 - >0101		8 - >1000
//a&b
//a = >0101			  0101
//b = >1000			  1000
//a&b=>0000		 a|b=>1101       


