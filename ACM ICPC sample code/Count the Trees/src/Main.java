import java.math.BigInteger;
import java.util.Scanner;


class Main
{
	public static void main(String[] args)
	{
		BigInteger n;
		BigInteger c;
		BigInteger temp; 
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		while(input.hasNext())
		{
			c=BigInteger.ONE;
			n=input.nextBigInteger();
			if(n.equals(BigInteger.ZERO))
				break;
			for(int i=2 ;i<=n.intValue() ; i++)
			{
				temp=new BigInteger(""+i);
				temp=temp.add(n);
				c=c.multiply(temp);
			}
			System.out.println(c);
		}
	}

}
