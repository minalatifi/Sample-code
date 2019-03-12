import java.util.Scanner;


class Main {
	public static void main(String[] args)
	{
		int n,m;
		int temp;
		int count;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		while(input.hasNext())
		{
			count=0;
			n = input.nextInt();
			m = input.nextInt();
			if(m==0 && n==0)
				break;
			if(n>m)
			{
				if(Math.floor(n/m)-1>0)
					System.out.println("Stan wins");
				else
				{
					while(m!=0 && Math.floor(n/m)-1==0)
					{
						count++;
						temp=n;
						n=m;
						m=temp%m;
					}
					if(Math.floor(n/m)-1>0)
					{
						if(count%2==0)
							System.out.println("Stan wins");
						else
							System.out.println("Ollie wins");
					}
					else
					{
						if(count%2==0)
							System.out.println("Ollie wins");
						else
							System.out.println("Stan wins");
					}
				}
			}
			else if(m==n)
			{
				System.out.println("Stan wins");
			}
			else
			{
				if(Math.floor(m/n)-1>0)
					System.out.println("Stan wins");
				else
				{
					while(n!=0 && Math.floor(m/n)-1==0)
					{
						count++;
						temp=m;
						m=n;
						n=temp%n;
					}
					if(Math.floor(m/n)-1>0)
					{
						if(count%2==0)
							System.out.println("Stan wins");
						else
							System.out.println("Ollie wins");
					}
					else
					{
						if(count%2==0)
							System.out.println("Ollie wins");
						else
							System.out.println("Stan wins");
					}
				}
			}
		}
	}

}
