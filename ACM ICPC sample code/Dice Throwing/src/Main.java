import java.math.BigInteger;
import java.util.Scanner;

class Main
{

	public static void main(String[] args)
	{
		short n;
		short x;
		int[] p;
		int temp;
		
		BigInteger sum;
		BigInteger n2;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		while(input.hasNext())
		{
			n=input.nextShort();
			x=input.nextShort();
			if(n==0 && x==0)
				break;
			p = new int[5*n+1];
			sum = new BigInteger("0");
			temp=(int) Math.pow(6,n);
			n2 = new BigInteger(Integer.toString(temp));
			temp=1;
			if(p.length%2==0)
			{
				for(int i=0 ; i<p.length/2 ; i++)
				{
					p[i]=p[5*n-i]=temp;
					temp+=n-1;
				}
			}
			else if(p.length%2!=0)
			{
				for(int i=0 ; i<p.length/2-1 ; i++)
				{
					p[i]=p[5*n-i]=temp;
					temp+=n-1;
				}
				p[(5*n+1)/2]=temp+n-1;
			}
			//
			for(int i=x-n ; i<p.length ; i++)
			{
				sum=sum.add(new BigInteger(Integer.toString(p[i])));
			}
			if(x<n || x>n*6)
				System.out.println(0);
			else
			{
				BigInteger g = new BigInteger("1");
				g=sum.gcd(n2);
				sum=sum.divide(g);
				n2=n2.divide(g);
				System.out.println(sum+"/"+n2);
			}
		}
	}

}
