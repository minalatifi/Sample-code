import java.util.Scanner;

class Main 
{
	public static void main(String[] args) 
	{
		int g1, g2, g3;
		int b1, b2, b3=0;
		int B = 0;
		int temp;
		int[] win = new int[6];
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) 
		{
			g1 = input.nextInt();
			g2 = input.nextInt();
			g3 = input.nextInt();
			b1 = input.nextInt();
			b2 = input.nextInt();
			if (g1 != 0) 
			{
				// b1-g1 & b2-g2
				if (b1 > g1)
					B++;
				if (b2 > g2)
					B++;
				win[0] = B;
				B = 0;
				// b1-g1 & b2-g3
				if (b1 > g1)
					B++;
				if (b2 > g3)
					B++;
				win[1] = B;
				B=0;
				// b1-g2 & b2-g3
				if (b1 > g2)
					B++;
				if (b2 > g3)
					B++;
				win[2] = B;
				B=0;
				// b1-g2 & b2-g1
				if (b1 > g2)
					B++;
				if (b2 > g1)
					B++;
				win[3] = B;
				B=0;
				// b1-g3 & b2-g1
				if (b1 > g3)
					B++;
				if (b2 > g1)
					B++;
				win[4] = B;
				B=0;
				// b1-g3 & b2-g2
				if (b1 > g3)
					B++;
				if (b2 > g2)
					B++;
				win[5] = B;
				B=0;
				//
				for(int i=0 ; i<5 ; i++)
				{
					if (win[i] < win[i+1])
					{
						temp = win[i];
						win[i] = win[i+1];
						win[i+1] = temp;
					}
				}
				//sort:
				if (g1>g2)
				{
					temp = g1;
					g1 = g2;
					g2 = temp;
				}
				if (g3<g1)
				{
					temp = g3;
					g3 = g2;
					g2 = g1;
					g1 = g3;
				}
				if (g3>g1 && g3<g2)
				{
					temp = g3;
					g3 = g2;
					g2 = temp;
				}
				if (b1>b2)
				{
					temp = b2;
					b2 = b1;
					b1 = temp;
				}
				//
				if (win[5]==0)
				{
					System.out.println(-1);
				}
				else if(win[5]==1)
				{
					if(b2>g3 && b1>g2)
						b3 = g2 + 1;
					if(b2>g3 && b1<g2)	
						b3 = g3 +1;
					
					if (b1<g3 && b1>g2 && b2<g3 && b2>g2)
						b3 = g2 + 1;
					
					while(b3<=52)
					{
						if(b3 != b1 && b3 != b2 && b3 != g1 && b3 != g2 && b3 != g3)
							break;
						else
							b3++;
					}
					if(b3 == b1 || b3 == b2 || b3 == g2 || b3 == g3 || b3>52)
						System.out.println(-1);
					else
						System.out.println(b3);
					
				}
				else if(win[5]==2)
				{
					b3=1;
					while(b3<=52)
					{
						if(b3 != b1 && b3 != b2 && b3 != g1 && b3 != g2 && b3 != g3)
							break;
						else
							b3++;
					}
					if(b3 == b1 || b3 == b2 || b3 == g1 || b3 == g2 || b3 == g3 || b3>52)
						System.out.println(-1);
					else
						System.out.println(b3);
				}
			} 
			else if (g1 == 0 && g2 == 0 && g3 == 0 && b1 == 0 && b2 == 0)
				break;
		}
		System.exit(0);
	}
}