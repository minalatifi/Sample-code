import java.util.Scanner;


class Main
{
	public static void main(String[] args)
	{
		long k;
		long n;
		double sum;
		long digit;
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		while(input.hasNext())
		{
			n = input.nextLong();
			k = input.nextLong();
			sum=0;
			if(k>n/2)
				k=n-k;
			for(int i=1 ; i<=k ; i++)
			{
				sum=sum+ (Math.log10(n-i+1));
				sum=sum- (Math.log10(i));
			}
			digit=(long) Math.floor(sum+1);
			String s=digit+"";
			System.out.println(s);
		}
	}
}
