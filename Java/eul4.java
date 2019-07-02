/*A palindromic number reads the same both ways.
The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
Find the largest palindrome made from the product of two 3-digit numbers.*/

public class eul4 
{
	public static boolean palindrome(int prod)
	{	
		int sum,temp=0,r;
		
		sum=0;
		temp=prod;
		while(prod>0)
		{	
			
			r=prod%10;
			sum=(sum*10)+r;
			prod=prod/10;
		}
		if(temp==sum)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	public static void main(String[] args) 
	{
		int prod,max=0;
		for(int i=999;i>=100;i--)
		{
			for(int j=999;j>=100;j--)
			{
				prod=i*j;
				
				if(palindrome(prod))
				{
					if(prod>max)
					{
						max=prod;
					}
					else
					{
						break;
					}
				}
			}
		}
		System.out.println(max);
		
		
		
		}

}
