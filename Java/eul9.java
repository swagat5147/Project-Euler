
/*A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
a2 + b2 = c2

For example, 32 + 42 = 9 + 16 = 25 = 52.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.*/

public class eul9 {

	public static void main(String[] args) {
		int p = 1;
		int n = 1000;
		for(int a = 0;a<=(n/3); a++)
		{
			int b = (n*n - 2*a*n)/(2*n - 2*a);
			int c = n - b - a;
			if(a*a + b*b == c*c)
				p = a*b*c;
		}
		System.out.println(p);
	}

}

/*Approach:

a+b+c = n -(1)
a^2+b^2 = c^2 -(2)
squaring eqn 1
a^2+b^2+c^2+2ab+2ac+2bc = n^2
2c^2+2(ab+bc+ac) = n^2 (from eqn 2)
n^2 is divisible by 2
hence n is divisible by 2
Also
a<b<c
It means
a<b -(3)
a<c -(4)
Adding 3 & 4
2a<b+c
Adding a to both sides
3a<a+b+c
3a<n (from eqn 1)
a<n/3 (This will help minimize hassle to find a)
Now
c = n-a-b (From eqn 1, also important to find c)
Putting this value in eqn 2
(n-a-b)^2 = a^2+b^2
n^2-2an-2bn+2ab = 0
Equating for b
2ab-2bn = 2an-n^2
b = (2an-n^2)/(2a-2n)
or
b = (n^2-2an)/(2n-2a) (Hence you get b as well)*/
