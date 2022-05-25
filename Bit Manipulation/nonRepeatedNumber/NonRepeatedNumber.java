/**
 * 
 */
package nonRepeatedNumber;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author apiiit-rkv
 * 
 * Given an array containing elements twice except one(Guaranteed) print that one number which 
 * Occurred  only once 
 * array[]={34,45,12,34,12,56,45,67,23,67,23}
 * Output: 56
 */
public class NonRepeatedNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter odd lenght array size: ");
		int n=sc.nextInt();
		int array[]=new int[n];
		System.out.println("Enter elements accarding to conditions: ");
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		
		System.out.println("Array: ");
		for(int i=0;i<n;i++)
		{
			System.out.print(array[i]+" ");
		}
		
		int nonrepeated=nonReapeatedNumber1(array);
		System.out.println("\nNon Repeated number: "+nonrepeated);
		nonrepeated=nonReapeatedNumber2(array);
		System.out.println("\nNon Repeated number: "+nonrepeated);
		sc.close();
	}

	
	private static int nonReapeatedNumber2(int[] array) {
		int temp=0;
		for(int i=0;i<array.length;i++)
		{
			temp^=array[i];
		}
		return temp;
	}


	//Time complexity:O(n) Space complexity:O(n)
	private static int nonReapeatedNumber1(int[] array) {
		
		
		Map<Integer,Integer>map=new LinkedHashMap<Integer,Integer>();
		
		for(int i=0;i<array.length;i++)
		{
			if(map.get(array[i])!=null)
			{
				map.put(array[i], map.get(array[i])+1);
			}
			else
			{
				map.put(array[i], 1);
			}
		}
		
		Iterator<Integer>iter= map.keySet().iterator();
		int value=0;
		while(iter.hasNext())
		{
			int key=iter.next();
			if(map.get(key)==1)
			{
				value=key;
				break;
			}
		}
		return value;
		//return 0;
	}

}
