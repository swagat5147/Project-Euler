
/*The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.*/


public class eul10 {
	public static boolean isPrime(long n)
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
		long sum=2,n=2000000,i=3;
		while(i<n)
		{	
			if(isPrime(i))
			{
				sum+=i;

			}
			i+=2;
		}
		System.out.println(sum);
	}

}