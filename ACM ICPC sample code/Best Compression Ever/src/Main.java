import java.util.Scanner;

class Main 
{
	public static void main(String[] args)
	{
		long n;
		int b;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) 
		{
			n = input.nextLong();
			b = input.nextInt();
			if (Math.pow(2, b + 1) - 1 >= n)
				System.out.println("yes");
			else
				System.out.println("no");
		}
	}

}
