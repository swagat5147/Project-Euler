
public class eul1 
{

	public static void main(String[] args) 
	{
		int sum=0,i;
		for(i=0;i<1000;i++)
		{
			if(i%5==0 || i%3==0)
			{
				sum=sum+i;
			}
		}
		System.out.println("sum of multiples of 3 and 5 below 1000 is: "+sum);
	}

}
