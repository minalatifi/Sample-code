import java.util.Scanner;


class Main
{
	public static void main(String[] args) 
	{
		int n;
		int b;
		int[] ball;
		int test;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		while (input.hasNext())
		{
			n = input.nextInt();
			b = input.nextInt();
			if (n == 0 && b == 0)
				break;
			else 
			{
				ball = new int[b];
				test = 1;
				for (int i=0 ; i<b ; i++)
					ball[i] = input.nextInt();
				
				for(int i=0 ; i<b-1 ; i++)
				{
					for (int j=i ; j<b ; j++)
					{
						if (test == ball[j]-ball[i] || test == ball[i]-ball[j])
						{
							test++;
							i = 0;
							j = 0;
						}
					}
				}
				if (test>n)
					System.out.println("Y");
				else
					System.out.println("N");
			}
		}
	}

}
