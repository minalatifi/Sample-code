import java.util.Scanner;


class Main
{
	public static void main(String[] args)
	{
		int x1 , x2;
		int y1 , y2;
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		while (input.hasNext())
		{
			x1 = input.nextInt();
			y1 = input.nextInt();
			x2 = input.nextInt();
			y2 = input.nextInt();
			
			if (x1 == 0 && y1 == 0 &&  x2 == 0 && y2 == 0)
				break;
			else
			{
				if(x1 == x2 && y1 == y2)
					System.out.println(0);
				else if (x1==x2 || y1==y2 || (x2-x1)==(y2-y1) || (x2-x1)==(y1-y2) && !(x1==x2 && y1==y2))
					System.out.println(1);
				else
					System.out.println(2);
			}
		}
	}
}
