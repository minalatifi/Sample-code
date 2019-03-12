import java.util.Scanner;


class Main
{
	public static void main(String[] args)
	{
		int n;
		double d,l;
		double a,b,c;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		n=input.nextInt();
		for(int i=0 ; i<n ;i++)
		{
			d=input.nextDouble();
			l=input.nextDouble();
			a=l/2;
			c=d/2;
			b=Math.sqrt(Math.pow(a,2)-Math.pow(c,2));
			System.out.printf("%.3f\n",(Math.acos(-1.0)*a*b));
		}
	}

}
