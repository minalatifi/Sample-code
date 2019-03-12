import java.util.Scanner;
class MainClass 
{
	public static void main(String[] args) 
	{
		int input;
		int m;
		int r;
		int result;
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		while(scanner.hasNext())
		{
			input = scanner.nextInt();
			
			if (input == 1)
			{
				System.out.println("TERM 1 IS 1/1");
			}
			else
			{
				m = (int) (Math.sqrt(8*input + 1)-1)/2;
				r = input - (m*(m+1))/2;
				result = (m+2-r);
				if ((m % 2) == 0)
				{
					if (r == 0)
					{
						m--;
						r=1;
						result = (m+2-r);
					}
					System.out.println("TERM "+ input +" IS "+ result + "/" + r);
				}
				else
				{	
					if (r == 0)
					{
						m--;
						r=1;
						result = (m+2-r);
					}
					System.out.println("TERM "+ input +" IS "+ r + "/" + result);
				}	
			}
		}
			
		
		System.exit(0);
	}
}