/**
 * 
 */
package powerOfTwo;

import java.util.Scanner;

/**
 * @author apiiit-rkv
 * 
	Input : n = 4
	Output : Yes
	22 = 4
	
	Input : n = 7
	Output : No
	
	Input : n = 32
	Output : Yes
	25 = 32
 *
 */
public class PowerOfTwo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number: ");
		int n=sc.nextInt();
//		
//		boolean ispower=isPower1(n);
//		System.out.println(ispower);
	boolean	ispower=isPower2(n);
		System.out.println(ispower);
		sc.close();
	}
	
	
	
	private static boolean isPower2(int n) {
				
//		if(n==0)
//			return true;
//		else
			return (n&(n-1))==0;
	}



	private static boolean isPower1(int n)
	{
		int count=0;
		while(n>0)
		{
			if((n&1)==1)
			{
				count++;
			}
			n=n>>1;
		}
		if(count==1)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}

}
