
public class eul3 
{

	public static void main(String[] args) 
	{
		long n=600851475143l;
		long i,max=0l;
		int j;
		for(i=2l;i<=n;i++) 
		{
			if(n%i==0)
			{   
				for(j=1;j<=Math.sqrt(i);j++)
				{
					if(j%i==0)
					{
						break;
					}
					else
					{
						while(n%i==0)
						{
							n=n/i;
							max=i;
						}
					}
				}
			}
	    }
		System.out.println("largest prime factor is: "+max);

     }

}