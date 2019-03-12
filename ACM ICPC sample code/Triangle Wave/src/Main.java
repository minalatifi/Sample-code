import java.util.Scanner;


class Main
{
	public static void main(String[] args)
	{
		int A,F;
		int n;
		long[] number= new long[10];
		
		number[0]=1;
		number[1]=22;
		number[2]=333;
		number[3]=4444;
		number[4]=55555;
		number[5]=666666;
		number[6]=7777777;
		number[7]=88888888;
		number[8]=999999999;
		String reshte;
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		n=input.nextInt();
		for(int i=0 ; i<n ; i++)
		{	
			A = input.nextInt();
			F = input.nextInt();
			reshte="";
			if(A!=1)
			{
				for (int k = 1; k <= A; k++) 
				{
					reshte = reshte + "" + number[k - 1];
					reshte = reshte + "\n";
				}
				for (int k = A - 1; k > 0; k--)
				{
					reshte = reshte + "" + number[k - 1];
					if (k != 1)
						reshte = reshte + "\n";
				}
			}
			else
				reshte="" + 1;
			for(int j=0 ; j<F ;j++)
			{
				System.out.println(reshte);
				
				if(!(i==n-1 && j==F-1))
					System.out.println();
			}
		}
	}

}
