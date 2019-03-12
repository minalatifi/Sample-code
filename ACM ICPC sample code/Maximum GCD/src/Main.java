import java.util.Scanner;
class Main
{
	static int GCD(int a , int b)
	{	
		if(b==0)
			return a;
		else
			return GCD(b,a%b);
	}
	public static void main(String[] args)
	{
		int n;
		int gcd;
		String in;
		String[] num = new String[110];
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		n=input.nextInt();
		in=input.nextLine();
		for(int i=0 ; i<n ; i++)
		{
			in=input.nextLine();
			num=in.split(" ");
			gcd=1;
			for(int j=0 ; j<num.length ; j++)
				for(int l=j+1 ; l<num.length ; l++)
					if(GCD(Integer.parseInt(num[j]),Integer.parseInt(num[l]))>gcd)
						gcd=GCD(Integer.parseInt(num[j]),Integer.parseInt(num[l]));
			System.out.println(gcd);
		}
	}
}