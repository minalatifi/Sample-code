import java.util.Arrays;
import java.util.Scanner;
class Main
{ 
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner in=new Scanner(System.in);
		int n,N=20000010;
		int[] a = new int[N];
		boolean[] prime = new boolean[N+1];
		Arrays.fill(prime, true);
		prime[0] = prime[1] = false;
		for (int p = 2; p * p <= N; ++p)
			if (prime[p])
				for (int i = p * p; i <= N; i += p)
					prime[i] = false;
		int j=1;
		for (int i = 0; i <= N - 2; ++i)
			if (prime[i] && prime[i + 2])
			{
				a[j]=i;
				j++;
			}
		while(in.hasNext())
		{
			n=in.nextInt();
			System.out.println("("+a[n]+", "+(a[n]+2)+")");
		}
	}
}