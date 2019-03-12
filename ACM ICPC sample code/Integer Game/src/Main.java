import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		String N;
		int[] digit;
		int sum;
		int r;
		boolean find;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int n=input.nextInt();
		for(int i=1 ; i<=n ; i++)
		{
			N=input.next();
			if(N.length()==1)
			{
				System.out.println("Case "+i+": S");
				continue;
			}
			sum=0;
			find=false;
			digit = new int[N.length()];
			for(int j=0 ; j<N.length() ; j++)
			{
				digit[j] = (N.charAt(j)-48)%3;
				sum+=digit[j];
			}
			r=sum%3;
			int m=0;
			for(int j=0 ; j<N.length() ; j++)
				if(digit[j]==0)
					m++;
			if(r==0)
			{
				if(m%2==1)
					System.out.println("Case "+i+": S");
				else
					System.out.println("Case "+i+": T");
			}
			else
			{
				for(int j=0 ; j<N.length() ; j++)
					if(digit[j]==r)
					{
						find=true;
						break;
					}
				if(find)
				{
					if(m%2==1)
						System.out.println("Case "+i+": T");
					else
						System.out.println("Case "+i+": S");
				}
				else
					System.out.println("Case "+i+": T");
			}
		}
	}
}
