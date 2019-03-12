import java.util.LinkedList;
import java.util.Scanner;


class Main
{
	public static void main(String[] args)
	{
		int N;
		int n,m;
		boolean b;
		LinkedList<Integer> job;
		int min;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		N=input.nextInt();
		for(int i=0 ; i<N ; i++)
		{
			min=0;
			n=input.nextInt();
			m=input.nextInt();
			
			job = new LinkedList<Integer>();
			job.clear();
			for(int j=0 ; j<n ; j++)
				job.add(input.nextInt());
			
			for(int index=0 ; index<n ; index++)
			{
			int temp=n;
			for(int j=0 ; j<temp ; j++)
			{	
				b=false;
				for(int k=j ; k<n ; k++)
				{
					if(job.get(j)<job.get(k))
					{
						b=true;
						job.addLast(job.get(j));
						job.remove(j);
						if(m==j)
							m=n-1;
						else if(m>j)
							m--;
					}
					if(b)
					{
						j=j-1;
						temp=temp-1;
						break;
					}
				}
			}
			}
			/*if(n==1)
				m=1;*/
			for(int j=0 ; j<=m ; j++)
				min++;
			System.out.println(min);
		}
	}

}
