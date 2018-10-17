/*The sum of the squares of the first ten natural numbers is,

12 + 22 + ... + 102 = 385
The square of the sum of the first ten natural numbers is,

(1 + 2 + ... + 10)2 = 552 = 3025
Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.*/
	
public class eul6 {

	public static void main(String[] args) {
	int i=1,j=1,sum1=0,sum2=0,diff;
	for(i=1;i<=100;i++)
	{
		sum1=sum1+(i*i);
	}
	for(j=1;j<=100;j++) 
	{
		sum2=sum2+j;
	}
	sum2= (int) Math.pow(sum2,2);
	diff=sum2-sum1;
	System.out.println("The difference between the sum of the squares of the first one hundred natural numbers and the square of the sum is: "+Math.abs(diff));
	}

}
