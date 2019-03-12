//Accepted
import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		int t;
		int n;
		int[] seq;
		int start;
		int end = 0;
		int s = 0,e = 0;
		int max;
		int sum=0;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		t=input.nextInt();
		for(int r=1 ; r<=t ; r++)
		{
			n=input.nextInt();
			seq=new int[n-1];
			for(int i=0 ; i<n-1 ; i++)
				seq[i]=input.nextInt();
			start=0;
			max=0;
			for(end=start ; end<n-1 ; end++)
			{
				sum=0;
				for(int i=start ; i<=end ; i++)
					sum=sum+seq[i];
				if(sum>max || (sum==max && end-start>e-s))
				{
					max=sum;
					s=start;
					e=end;
				}
				else if(sum<0)
				{
					start=end+1;
					if(start>=n-1)
						break;
				}
			}
			if(max==0)
				System.out.println("Route "+r+" has no nice parts");
			else
				System.out.println("The nicest part of route "+r+" is between stops "+(s+1)+" and "+(e+2));
		}
	}

}
