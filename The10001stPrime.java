/**
 * 
 * @author David Lambropolos
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * 
 * What is the 10 001st prime number?
 *
**/

public class The10001stPrime 
{
	static int iterations = 0;
	
	public static void main(String[] args)
	{
		long start=System.currentTimeMillis();
		int counter = 0;
		int incrementer = 0;
		int primeNumber = 0;
		
		while(counter <= 10001)
		{
			incrementer++;
			iterations++;
			if(isPrime(incrementer))
			{
				counter++;
				primeNumber = incrementer;
			}
			
			
		}
		
		System.out.println("The 10001st prime number: " + primeNumber);
		System.out.println("Completed in " + iterations + " iterations");
		long end=System.currentTimeMillis();
	        System.out.println("Time for execution="+(end-start)+"ms");
	}
	
	public static boolean isPrime(int x)
	{
		boolean prime = true;
		
		for(int i = 2; i <= Math.sqrt(x); i++)
		{
			iterations++;
			if(x%i == 0)
			{
				prime = false;
				break;
			}
		}
		
		return prime;
	}
}

/**
 *    /////////////////
 *    //// OUTPUT ////
 *    ////////////////
 *    
 * The 10001st prime number: 104743
 * Completed in 3030706 iterations
 * Time for execution=19ms
 * 
**/
