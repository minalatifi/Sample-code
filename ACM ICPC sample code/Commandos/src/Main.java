//Accepted
import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		int t;
		int n;
		int r;
		int[][] adj;
		int s,d;
		int u,v;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		t=input.nextInt();
		for(int index=1 ; index<=t ; index++)
		{
			n=input.nextInt();
			adj=new int[n][n];
			for(int i=0 ; i<n ; i++)
				for(int j=0 ; j<n ; j++)
				{
					if(i!=j)
						adj[i][j]=110;
					else
						adj[i][j]=0;
				}
					
			r=input.nextInt();
			for(int i=0 ; i<r ; i++)
			{
				u=input.nextInt();
				v=input.nextInt();
				adj[u][v]=1;
				adj[v][u]=1;
			}
			for(int k=0 ; k<n ; k++)
				for(int i=0 ; i<n ; i++)
					for(int j=0 ; j<n ; j++)
						adj[i][j]=Math.min(adj[i][j],adj[i][k]+adj[k][j]);
			int max=0;
			s=input.nextInt();
			d=input.nextInt();
			for(int i=0 ; i<n ; i++)
				if(adj[s][i]+adj[i][d]>max)
					max=adj[s][i]+adj[i][d];
			System.out.println("Case "+index+": "+max);
		}
	}

}
