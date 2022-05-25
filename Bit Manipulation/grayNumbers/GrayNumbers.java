package grayNumbers;

import java.util.Scanner;

public class GrayNumbers {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Num1: ");
		int n1=sc.nextInt();
		System.out.print("Enter Num2: ");
		int n2=sc.nextInt();
		
		boolean isgraynumber=isGrayNumbers1(n1,n2);
		System.out.println(isgraynumber);
		
		isgraynumber=isGrayNumber2(n1,n2);
		System.out.println(isgraynumber);
		sc.close();

	}

	private static boolean isGrayNumber2(int n1, int n2) {
		
		int temp=n1^n2;
		return (temp &(temp-1))==0;
	}

	private static boolean isGrayNumbers1(int n1, int n2) {
		
		int temp=n1^n2;
		while(temp>0 && temp>>1>0)
		{
			if(temp%2==1)
			{
				return false;
			}
			temp=temp >> 1;
		}
		return true;
	}
	

}
