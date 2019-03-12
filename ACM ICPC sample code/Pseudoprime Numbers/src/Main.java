import java.math.BigInteger;
import java.util.Scanner;


class Main
{
	public static void main(String[] args)
	{
		BigInteger p;
		BigInteger a;
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		while(input.hasNext())
		{
			p=input.nextBigInteger();
			a=input.nextBigInteger();
			if(p.equals(BigInteger.ZERO)&&a.equals(BigInteger.ZERO))
				break;
			if(!p.isProbablePrime(10))
			{
				if(a.modPow(p, p).equals(a))
				{
					System.out.println("yes");
				}
				else
				{
					System.out.println("no");
				}
			}
			else
				System.out.println("no");
				
		}
	}
}
