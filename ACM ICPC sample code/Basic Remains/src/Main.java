import java.math.BigInteger;
import java.util.Scanner;
class Main
{
	public static void main(String[] args)
	{
		int b;
		BigInteger p;
		BigInteger m;
		BigInteger mod;
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		while(input.hasNext())
		{
			b=input.nextInt();
			if(b==0)
				break;
			p = new BigInteger(input.next() , b);
			m = new BigInteger(input.next() , b);
			mod=p.mod(m);
			System.out.println(mod.toString(b));
		}
	}
}