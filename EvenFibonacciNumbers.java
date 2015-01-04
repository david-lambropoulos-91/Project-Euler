/**
 * 
 * @author David Lambropoulos
 * 
 * Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
 *
 */

public class EvenFibonacciNumbers 
{
	public static void main(String[] args)
	{
		long start = System.currentTimeMillis();	//Begin timing
		
		int a_0 = 1;
		int a_1 = 2;
		int dummy = 0;
		int sum = 0;
		
		while(a_1 <= 4000000)
		{
			if(a_1%2 == 0)
			{
				sum += a_1;
			}
			
			dummy = a_0;
			a_0 = a_1;
			a_1 = dummy + a_1;
		}
		
		System.out.println("The total sum is: " + sum);
		
		long end = System.currentTimeMillis();	//End timing
		System.out.println("Time for Execution: " + (end-start) + "ms");
	}
}

/**
 *  OUTPUT (ANSWER)
 *  ----------------------
 *  The total sum is: 4613732
 *  Time for Execution: 0ms
 */
