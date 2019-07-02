/*The sum of the squares of the first ten natural numbers is,

12 + 22 + ... + 102 = 385
The square of the sum of the first ten natural numbers is,

(1 + 2 + ... + 10)2 = 552 = 3025
Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.*/
	

public class eul6 {

	public static void main(String[] args) {
		int n = 100;
		double a = Math.pow((n*(n+1)/2), 2);
		double b = n*(n+1)*(2*n+1)/6;
		double diff = Math.abs(a-b);
		System.out.println((int)diff);
	}

}
