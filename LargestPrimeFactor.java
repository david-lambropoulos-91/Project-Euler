
/**
 * 
 * @author David Lambropoulos
 * 
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 *
 */

public class LargestPrimeFactor 
{
	public static void main(String[] args)
	{

		long start=System.currentTimeMillis();	//Start timing
		double num = 600851475143.0;
		int factor = 0;
		int counter = 1;
		
		
		while(num > factor)
		{
			if(isPrime(counter))
			{
				if(num%counter == 0)
				{
					num /= counter;
					factor = counter;
				}
			}
			
			counter++;
		}
		
		
		System.out.println("The largest factor is: " + factor);
		System.out.println("The iterations were: " + counter);

		long end=System.currentTimeMillis();	//End timing
        System.out.println("Time for execution="+(end-start)+"ms");
	}
	
	/**
	 * 
	 * @param x An int to be determined to be prime.
	 * @return prime Holding the value as to whether it is prime or not.
	 */
	public static boolean isPrime(int x)
	{
		boolean prime = true;
		
		for(int i = 2; i <= Math.sqrt(x); i++)
		{
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
 * The largest factor is: 6857
 * The iterations were: 6858
 * Time for execution=4ms
**/
