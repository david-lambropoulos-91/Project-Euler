/**
 * 
 * @author David Lambropolos
 * 
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 *
 */

public class MultiplesOf3and5 
{
	public static void main(String[] args)
	{
		long start = System.currentTimeMillis();	//Start timing
		int sum = 0;
		
		for(int i = 1; i < 1000; i++)
		{
			if(i%3 == 0 || i%5 == 0)
			{
				sum+=i;
			}
		}
		
		System.out.println("The sum is: " + sum);
		
		long end = System.currentTimeMillis();		//End timing
		System.out.println("Time for execution = "+(end-start)+"ms");
	}
}

/**
 *    /////////////////
 *    //// OUTPUT ////
 *    ////////////////
 *    
 *    The sum is: 233168
 *    Time for execution = 0ms
 */
