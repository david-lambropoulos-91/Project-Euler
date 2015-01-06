/**
 * 
 * @author David Lambropolos
 * 
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 *
 */

public class SmallestMultiple 
{
	public static void main(String[] args)
	{
		long start = System.currentTimeMillis();	//Start timing
		int num = 19;
		boolean isSmallest = false;
		
		while(isSmallest != true)
		{
			num++;
			
			for(int i = 1; i <= 20; i++)
			{
				if(!isDivisible(num,i))
				{
					isSmallest = false;
					break;
				}
		
				isSmallest = true;
			}		
		}
		
		System.out.println("The smallest Multiple is " + num);
		long end = System.currentTimeMillis();		//End timing
		System.out.println("Time for execution = "+(end-start)+"ms");
	}
	
	public static boolean isDivisible(int x, int y)
	{
		boolean divisible = true;
		
		if(x%y != 0)
			divisible = false;
		
		return divisible;
	}
}

/**
* OUTPUT
* -----------------------------------
* The smallest Multiple is 232792560
* Time for execution = 2519ms
**/
