import java.util.Scanner;
class Main
{
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		long min,max,m,n;
		while(input.hasNext())
		{
			m=input.nextInt();
			n=input.nextInt();
			if(m==0 && n==0)
				break;
			min=Math.min(m,n);
			max=Math.max(m,n);
			System.out.println(m*n*(m+n-2)+(max-min+1)*min*(min-1)*2+(min-2)*(min-1)*min*4/3);
		}
	}
}
