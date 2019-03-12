import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		int n;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		while(input.hasNext())
		{
			n=input.nextInt();
			if(n==0)
				break;
			if(n%2==1 || n==2)
				System.out.println("Impossible");
			else if(n%2==0 && n>3)
			{
				System.out.println((n/2)*3);
				for(int i=1 ; i<n ; i++)
					System.out.println(i+" "+(i+1));
				System.out.println(n+" "+1);
				for(int i=1 ; i<=n/2 ; i++)
					System.out.println(i+" "+(n/2+i));
			}
		}
	}

}
