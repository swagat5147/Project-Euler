/*The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?*/
	
public class eul3 
{

	public static boolean is_Prime(long n) {
		if (n < 2) {
			return false;
		}
		if (n == 2) {
			return true;
		}
		if (n % 2 == 0) {
			return false;
		}
		for (int i = 3; i <= Math.sqrt(n) + 1; i+=2) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main (String[]args) {
		long n=600851475143l;
		long i;
		long max = 0;
		for(i = 2; i <=n; i++)
		{
			if(n%i == 0)
			{
				n/=i;
				if(is_Prime(i))
				{
					max = i;
				}
			}
		}	
		System.out.println(max);
	}
}