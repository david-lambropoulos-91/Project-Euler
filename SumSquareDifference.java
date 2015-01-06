/**
 * 
 * @author David Lambropolos
 * 
 * The sum of the squares of the first ten natural numbers is,
 * 1^2 + 2^2 + ... + 10^2 = 385
 *
 * The square of the sum of the first ten natural numbers is,
 * (1 + 2 + ... + 10)^2 = 55^2 = 3025
 * 
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
 * 
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 * 
**/

public class SumSquareDifference 
{
	public static void main(String[] args)
	{
		long start = System.currentTimeMillis();	//Start timing
		int sumOfSquares = 0;
		int squareOfSum = 0;
		int difference = 0;
		
		for(int i = 1; i <= 100; i++)
		{
			sumOfSquares += i*i;
			squareOfSum += i;
		}
		
		squareOfSum *= squareOfSum;
		
		difference = squareOfSum - sumOfSquares;
		
		System.out.println("The difference is: " + difference);
		long end = System.currentTimeMillis();		//End timing
		System.out.println("Time for execution = "+(end-start)+"ms");
	}
}

/**
 *    /////////////////
 *    //// OUTPUT ////
 *    ////////////////
 *    
 * The difference is: 25164150
 * Time for execution = 1ms
 *
**/
