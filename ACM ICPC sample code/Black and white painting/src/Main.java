import java.util.Scanner;

class Main 
{
	public static void main(String[] args) 
	{
		int n;
		int m;
		int c;
		int result;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		while(input.hasNext())
		{
			n = input.nextInt();
			m = input.nextInt();
			c = input.nextInt();
			if(n==0 && m==0 && c==0)
				break;
			if((m-7)*(n-7)%2==0)
			{
					result=(m-7)*(n-7)/2;
					System.out.println(result);
			}
			else if((m-7)*(n-7)%2!=0)
			{
				if(c==1)
				{
					result=((m-7)*(n-7)+1)/2;
					System.out.println(result);
				}
				else
				{
					result=((m-7)*(n-7)-1)/2;
					System.out.println(result);
				}
			}
		}
	}

}
