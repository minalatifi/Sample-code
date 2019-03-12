//Accepted :)
import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		int p;
		int s;
		int n;
		int r1,r2;
		int c1,c2;
		int[][] a;
		int[][] b;
		int max;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		p=input.nextInt();
		for(int index=1 ; index<=p ; index++)
		{
			max=0;
			s = input.nextInt();
			a = new int[s][s];
			b = new int[s][s];
			for(int i=0 ; i<s ; i++)
				for(int j=0 ; j<s ; j++)
					a[i][j]=1;
			n = input.nextInt();
			for(int block=1 ; block<=n ; block++)
			{
				r1=input.nextInt();
				c1=input.nextInt();
				r2=input.nextInt();
				c2=input.nextInt();
				for(int i=r1-1 ; i<r2 ; i++)
					for(int j=c1-1 ; j<c2 ; j++)
						a[i][j]=0;
			}
			//
			b[0][0]=a[0][0];
			for(int i=1 ; i<s ; i++)
				b[0][i]=b[0][i-1]+a[0][i];
			for(int i=1 ; i<s ; i++)
				for(int j=0 ; j<s ; j++)
				{
					if(j==0)
						b[i][j]=b[i-1][j]+a[i][j];
					else
						b[i][j]=b[i-1][j]+b[i][j-1]-b[i-1][j-1]+a[i][j];
				}
			//1
			for(int k=0 ; k<s ; k++)
				for(int l=0 ; l<s ; l++)
					if(b[k][l]>max && b[k][l]==(k+1)*(l+1))
						max=b[k][l];
			//2
			for(int j=1 ; j<s ; j++)
				for(int k=0 ; k<s ; k++)
					for(int l=j ; l<s ; l++)
						if(b[k][l]-b[k][j-1]>max && b[k][l]-b[k][j-1]==(k+1)*(l-j+1))
							max=b[k][l]-b[k][j-1];
			//3
			for(int i=1 ; i<s ; i++)
					for(int k=i ; k<s ; k++)
						for(int l=0 ; l<s ; l++)
							if(b[k][l]-b[i-1][l]>max && b[k][l]-b[i-1][l]==(k-i+1)*(l+1))
								max=b[k][l]-b[i-1][l];
			//4
			for(int i=1 ; i<s ; i++)
				for(int j=1 ; j<s ; j++)
					for(int k=i ; k<s ; k++)
						for(int l=j ; l<s ; l++)
							if(b[k][l]-b[i-1][l]-b[k][j-1]+b[i-1][j-1]>max && b[k][l]-b[i-1][l]-b[k][j-1]+b[i-1][j-1]==(k-i+1)*(l-j+1))
								max=b[k][l]-b[i-1][l]-b[k][j-1]+b[i-1][j-1];
			System.out.println(max);
		}
	}
}
