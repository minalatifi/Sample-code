import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		String word;
		int n;
		int k;
		BigInteger f;
		int[] count = new int[26];
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		n=input.nextInt();
		for(int i=0 ; i<n ; i++)
		{
			f=new BigInteger("1");
			word=input.next();
			k=word.length();
			for(int j=2 ; j<=k ; j++)
				f=f.multiply(BigInteger.valueOf(j));
			Arrays.fill(count,0);
			for(int j=0 ; j<k ; j++)
				count[(int) word.charAt(j)-65]++;
			for(int j=0 ; j<26 ; j++)
				if(count[j]>1)
					for(int t=2 ; t<=count[j] ; t++)
						f=f.divide(BigInteger.valueOf(t));
			
			System.out.println("Data set "+(i+1)+": "+(f));
		}
	}
}
