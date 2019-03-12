import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		int n;
		int m;
		int c;
		int k;
		int in;
		boolean[][] state;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		n=input.nextInt();
		for(int index=0 ; index<n ; index++)
		{
			m=input.nextInt();
			c=input.nextInt();
			state=new boolean[c][m+1];
			for(int i=0 ; i<c ; i++)
				for(int j=0; j<m+1 ; j++)
					state[i][j]=false;
			k=input.nextInt();
			for(int j=0 ; j<k ; j++)
			{
				in=input.nextInt();
				if(m-in>=0)
					state[0][m-in]=true;
			}
			for(int i=1 ; i<c ; i++)
			{
				k=input.nextInt();
				for(int j=0 ; j<k ; j++)
				{
					in=input.nextInt();
					for(int l=0 ; l<m+1 ; l++)
					{
						if(state[i-1][l] && l-in>=0)
						{
							state[i][l-in]=true;
						}
					}
				}
			}
			boolean b=false;
			for(int i=0 ; i<m+1 ; i++)
			{
				if(state[c-1][i])
				{
					System.out.println(m-i);
					b=true;
					break;
				}
			}
			if(b==false)
				System.out.println("no solution");
		}
	}

}
