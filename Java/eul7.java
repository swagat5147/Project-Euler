/*By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?*/


public class eul7 {
	public static boolean isPrime(int n)
	{
		if (n < 2) {
			return false;
		}
		if (n == 2) {
			return true;
		}
		if (n % 2 == 0) {
			return false;
		}
		for (int i = 3; i <= Math.sqrt(n) + 1; i+=2) 
		{
			if (n % i == 0) {
				return false;
			}
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
		System.out.println(n);
	}

}
