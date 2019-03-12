import java.util.Arrays;
import java.util.Scanner;

class Main 
{
	public static void main(String[] args) 
	{
		int n;
		int[] x;
		int[] abs;
		int mins=1;
		int N=1;
		int A=0;
		int[] temp;
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		while (input.hasNext())
		{
			n = input.nextInt();
			mins=1;
			N=1;
			
			x = new int[1000000];
			abs = new int[1000000];
			temp = new int[n];
			for(int i=0 ; i<n ; i++)
			{
				x[i] = input.nextInt();
			}
			for(int i=0 ; i<n ; i++)
				temp[i]=x[i];
			Arrays.sort(temp);
			if(n%2==1)
			{
				mins=1;
				A = temp[(n+1)/2 -1];
				N=1;
				//
				for(int i=0 ; i<(n+1)/2 -1 ; i++)
					if(temp[i]==A)
						N++;
				for(int i=(n+1)/2 ; i<n ; i++)
					if(temp[i]==A)
						N++;
				
			}
			else if(n%2==0)
			{
				N=2;
				A = temp[(n/2)-1];
				if(temp[(n/2)-1] != temp[n/2])
				for(int p=temp[(n/2)-1]+1 ; p<=temp[n/2] ; p++)
				{
					mins++;
				}
				//
				for(int i=0 ; i<(n/2)-1 ; i++)
					if(temp[i]==A)
						N++;
				for(int i=(n/2)+1 ; i<n ; i++)
					if(temp[i]==temp[n/2])
						N++;
			}	
			for(int i=0 ; i<n ; i++)
			{
				if (temp[i]-A >= 0)
					abs[i]=temp[i]-A;
				else
					abs[i]=A-temp[i];
			}
			
//			for(int i=0 ; i<n ; i++)
//			{	
//				temp[i]=0;
//				temp[i]=abs[i];
//			}
//			Arrays.sort(temp);
//			for(int i=0 ; i<n-1 ; i++)
//			{
//				if(temp[i]==temp[i+1])
//					N++;
//				else
//					break;
//			}
			System.out.println(A+" "+N+" "+mins);
		}
		System.exit(0);
	}
	
}