import java.util.Scanner;
//import java.lang.*;
import java.util.TreeMap;

class Main
{
	static int gcd(int a, int b)
	{
	  if(a == 0 || b == 0) return a+b;
	  return gcd(b,a%b);
	}
	public static void main(String[] args)
	{
		int n;
		int k;
		TreeMap<Float,String> kasr = new TreeMap<>();
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		Float temp;
		
		while(input.hasNext())
		{
			n=input.nextInt();
			k=input.nextInt();
			kasr.clear();
			for(int i=1 ; i<n ; i++)
			{
				for(int j=i ; j<=n ; j++)
				{
					if(gcd(i,j)==1)
					{
						temp=(float) ((float) i)/((float) j);
						kasr.put(temp,i+"/"+j);
					}
				}
			}
			int m=0;
			for(String s : kasr.values())
			{
				if(m==k-1)
				{
					System.out.println(s);
					break;
				}
				m++;
			}
		}
	}	
}
