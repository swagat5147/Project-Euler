/*By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?*/

public class eul7 {
	public static boolean isPrime(int n)
	{
		for(int i=2;i<=Math.sqrt(n);i++) 
		{
			if(n%i==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
	int p=0,n=1;
	while(p<10001)
	{	
		n++;
		if(isPrime(n))
		{
			p++;
			
		}
		
	}
	System.out.println("The 10001st prime number is: "+n);
	}

}
