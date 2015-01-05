import java.util.Stack;


public class LargestPalindromeProduct 
{
	public static void main(String[] args)
	{	
		long start=System.currentTimeMillis();	//Start timing
		int num1 = 0;
		int num2 = 0;
		int largest = 0;
		
		for(int i = 100; i < 1000; i++)
		{
			for(int j = 100; j < 1000; j++)
			{
				if(isPalindrome(i*j))
				{
					if(i*j > largest)
					{
						num1 = i;
						num2 = j;
						largest = i*j;
					}
				}
			}
		}
		
		System.out.println("The largest plaindrome is: " + largest);
		System.out.println("The first number is: " + num1 + " and the second number is " + num2);
		long end=System.currentTimeMillis();	//End timing
        	System.out.println("Time for execution="+(end-start)+"ms");
	}
	
	public static boolean isPalindrome(int x)
	{
		boolean palin = true;
		int limit = (int)(Math.log10(x)+1);	//Get the length of the number
		int temp = 0;		//Temporary
		int dummy = x;		//Variables
		
		//Create a stack
		Stack<Integer> checker = new Stack<Integer>();
		
		//Push digits into the stack for reverse order.
		for(int i = 0; i < limit; i++)
		{
			temp = dummy%10;
			dummy /= 10;
			checker.push(temp);
		}
		
		dummy = x;
		
		//Compare reverse digits to original digits
		for(int i = 0; i < limit; i++)
		{
			temp = dummy%10;
			dummy /= 10;
			
			if(temp != checker.pop())
			{
				palin = false;
			}
		}
		
		return palin;
	}
}

/**
*	The largest plaindrome is: 906609
*	The first number is: 913 and the second number is 993
*	Time for execution=106ms
**/
