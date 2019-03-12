import java.util.Scanner;

class Main 
{
	public static void main(String[] args) 
	{
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		@SuppressWarnings("unused")
		int n;
		int k;
		int m;
		m = input.nextInt();
		for(int i=0 ; i<m ; i++)
		{
			n = input.nextInt();
			k = input.nextInt();
			System.out.println(k^(k/2));
		}
	}

}
