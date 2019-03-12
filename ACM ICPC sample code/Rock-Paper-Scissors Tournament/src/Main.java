import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{	
		int[][] win;
		int[][] lose;
		int p1 , p2;
		String m1 , m2;
		int p;
		int k;
		int[] w;
		int[] l;
		int temp;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		while (input.hasNext())
		{
			p = input.nextInt();
			if (p == 0)
			{
				break;
			}

			
			else
			{
				k = input.nextInt();
				temp = k;
				win = new  int[p][k*(p-1)*p/2];
				lose = new int[p][k*(p-1)*p/2];
				for (k=k*(p-1)*p/2 ; k>0 ; k--)
				{
					p1 = input.nextInt();
					m1 = input.next();
					p2 = input.nextInt();
					m2 = input.next();
					
					if (m1.equals("rock") && m2.equals("paper"))
					{
						lose[p1-1][k-1] = 1;
						lose[p2-1][k-1] = 0;
						win[p2-1][k-1] = 1;
						win[p1-1][k-1] = 0;
					}
					if (m2.equals("rock") && m1.equals("paper"))
					{
						lose[p2-1][k-1] = 1;
						lose[p1-1][k-1] = 0;
						win[p1-1][k-1] = 1;
						win[p2-1][k-1] = 0;
					}
					if (m1.equals("paper") && m2.equals("scissors"))
					{
						lose[p1-1][k-1] = 1;
						lose[p2-1][k-1] = 0;
						win[p2-1][k-1] = 1;
						win[p1-1][k-1] = 0;
					}
					if (m2.equals("paper") && m1.equals("scissors"))
					{
						lose[p2-1][k-1] = 1;
						lose[p1-1][k-1] = 0;
						win[p1-1][k-1] = 1;
						win[p2-1][k-1] = 0;
					}
					if (m1.equals("scissors") && m2.equals("rock"))
					{
						lose[p1-1][k-1] = 1;
						lose[p2-1][k-1] = 0;
						win[p2-1][k-1] = 1;
						win[p1-1][k-1] = 0;
					}
					if (m2.equals("scissors") && m1.equals("rock"))
					{
						lose[p2-1][k-1] = 1;
						lose[p1-1][k-1] = 0;
						win[p1-1][k-1] = 1;
						win[p2-1][k-1] = 0;
					}
					
				}	
			}
			k = temp*(p-1)*p/2;
			w = new int[p];
			l = new int[p];
			//System.out.println("");
			for(int i=0 ; i<p ; i++)
			{
				w[i]=0;
				l[i]=0;
				for (int j=0 ; j<k ; j++)
				{
					w[i]=w[i]+win[i][j];
					l[i]=l[i]+lose[i][j];
				}
				if ((w[i]+l[i]) != 0)
				{
					System.out.printf("%1.3f",Math.round(( (float) w[i]/(w[i]+l[i]) )*1000.0)/1000.0);
					System.out.println();
				}
			
				else if(w[i]+l[i] == 0)
					System.out.println("-");
			}
			System.out.println();
		}		
		System.exit(0);
	}
}
