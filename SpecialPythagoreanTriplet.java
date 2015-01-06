/**
 *
 * @author David Lambropolos
 *
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 * a^2 + b^2 = c^2
 * 
 * For example, 32 + 42 = 9 + 16 = 25 = 52.
 * 
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 *
**/

public class SpecialPythagoreanTriplet 
{
	public static void main(String[] args)
	{
		long start=System.currentTimeMillis();
		int a = 0, b = 0, c = 0;
		boolean found = false;
		int iterations = 0;
		
		for(int i = 1; i < 1000; i++)
		{
			for(int j = i+1; j < 1000; j++)
			{
				for(int k = i+2; k < 1000; k++)
				{
					iterations++;
					if((i + j + k) == 1000 && (i*i + j*j) == (k*k))
						
					{
						a = i;
						b = j;
						c = k;
						found = true;
					}
					
					if(found == true)
						break;
				}
				if(found == true)
					break;
			}
			if(found == true)
				break;
		}
		
		System.out.println("a = " + a + " b = " + b + " c = "+ c);
		System.out.println("a*b*c = " + (a*b*c));
		System.out.println("Completed in " + iterations + " iterations.");
		long end=System.currentTimeMillis();
        	System.out.println("Time for execution="+(end-start)+"ms");
	}
}

/**
 * /////////////////
 * //// OUTPUT ////
 * ////////////////
 * 
 * a = 200 b = 375 c = 425
 * a*b*c = 31875000
 * Completed in 161448874 iterations.
 * Time for execution=122ms
 *
**/
