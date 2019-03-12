import java.util.Scanner;


class Main
{
	public static void main(String[] args)
	{
		int n;
		int index=0;
		int number=0;
		int temp;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		while(input.hasNext())
		{
			n=input.nextInt();
			if(n<0)
				break;
			index=0;
			number++;
			temp=n;
			
			for (int i = 0; i < 15; i++)
			{
				if (n != 0) 
				{
					n = n / 2;
					index++;
				}
				else
					break;
			}
			if(Math.pow(2, index)==temp*2)
				index--;
			if(n==1)
				index=0;
			System.out.println("Case "+number+": "+index);
		}
	}

}
