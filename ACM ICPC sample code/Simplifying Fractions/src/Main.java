import java.math.BigInteger;
import java.util.Scanner;


class Main
{
	public static void main(String[] args)
	{
		BigInteger p,q;
		BigInteger g;
		int n;
		@SuppressWarnings("unused")
		String c;
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		for(int i=0 ; i<n ; i++)
		{
			p=input.nextBigInteger();
			c=input.next();
			q=input.nextBigInteger();
			g=p.gcd(q);
			p=p.divide(g);
			q=q.divide(g);
			System.out.println(p+" / "+q);
		}
	}

}
