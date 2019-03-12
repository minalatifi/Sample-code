import java.util.Scanner;


public class Main 
{
	public static void main(String[] args)
	{
		int[] carNo;
		int[] wl;
		int[] start;
		int n;
		boolean B = true;
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext())
		{
			n = input.nextInt();
			if(n==0)
				break;
			B=true;
			carNo = new int[n];
			wl = new int[n];
			start = new int[n];
			for(int i=0 ; i<n ; i++)
				start[i]=0;
			for(int i=0 ; i<n ; i++)
			{
				carNo[i]=input.nextInt();
				wl[i]=input.nextInt();
				if(wl[i]<-i || wl[i]>(n-1)-i)
					B=false;
				else
					start[i+wl[i]] = carNo[i];
			}
			for(int i=0 ; i<n ; i++)
			{
				if (start[i]==0)
					B=false;
			}
			if (B==false)
				System.out.println(-1);
			else
			{
				for(int k=0 ; k<n ; k++)
				{
					if(k<n-1)
						System.out.print(start[k]+" ");
					if(k==n-1)
						System.out.print(start[k]);
				}
					
				System.out.println();
			}
				
		}
	}

}
