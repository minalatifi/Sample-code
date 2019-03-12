//Accepted

import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		int n;
		int m;
		int t;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		t=input.nextInt();
		for(int i=0 ; i<t ; i++)
		{
			n=input.nextInt()-2;
			m=input.nextInt()-2;
			if(n%3==0)
				n=n/3;
			else
				n=n/3 + 1;
			if(m%3==0)
				m=m/3;
			else
				m=m/3 + 1;
			System.out.println(m*n);
		}
	}

}
