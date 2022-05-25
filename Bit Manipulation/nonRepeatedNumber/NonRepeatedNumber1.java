/**
  	
  Given an array containing elements thrice except one(Guaranteed) print that one number which 
  Occurred  only once 
 

	Input: arr[] = {12, 1, 12, 3, 12, 1, 1, 2, 3, 3}
	Output: 2
 */
package nonRepeatedNumber;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author apiiit-rkv
 *
 */
public class NonRepeatedNumber1 {

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
		nonrepeated=nonRepeateNumber2(array);
		System.out.println("\nNon Repeated number: "+nonrepeated);
		sc.close();

	}

	
	//Using bitwise operators
	//Time complexity: O(n) Space complexity:O(1)
	private static int nonRepeateNumber2(int[] array) {
		
		int ones=0;
		int twos=0;
		int not_threes;
		for(int i=0;i<array.length;i++)
		{
			twos=twos|ones&array[i];	//to add number if it is present in ones
			ones=ones^array[i];			//to add number to once and remove from it if already presents
			not_threes=~(ones&twos);
			
			ones=ones&not_threes;
			twos=twos&not_threes;
		}
		
		return ones;
	}

	//Using hashMap
	//Time complexity:O(n) Space complexity: O(n)
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
