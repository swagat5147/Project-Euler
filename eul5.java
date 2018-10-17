/*2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?*/
	
public class eul5 
{

	public static void main(String[] args) 
	{
		int a=2520;
		int b=11;
		while(true)
		{
			if(a%b==0)
			{
				b++;
				if(b==20)
				{
					System.out.println("the lcm of numbers from 1 to 20 is: "+a);
					break;
				}
			}
			else
			{
				a++;
				b=11;
			}
		}

	}

}
