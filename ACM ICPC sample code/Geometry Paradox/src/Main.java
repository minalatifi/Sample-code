import java.util.Scanner;


class Main
{
	public static void main(String[] args)
	{
		double r1,r2,t;
		String inputLine;
		String[] numbers;
		int n;
		double s;
		char[] temp;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		n = input.nextInt();
		inputLine = input.nextLine();
		for(int i=0 ; i<n ; i++)
		{
			inputLine = input.nextLine();
			numbers = inputLine.split(" ");
			if(numbers.length==2)
			{
				r1=r2=s=0.0;
				temp = numbers[0].toCharArray();
				for(int j=0 ; j<temp.length ; j++)
				{
					r1=r1*10+(double) ((int) temp[j]-48);
				}
				temp = numbers[1].toCharArray();
				for(int j=0 ; j<temp.length ; j++)
				{
					r2=r2*10+(double) ((int) temp[j]-48);
				}
				s = 2*2*Math.acos(0)*r1*r2;
				System.out.printf("%.4f\n", s);
			}
			else
			{
				t=0;
				temp = numbers[0].toCharArray();
				for(int j=0 ; j<temp.length ; j++)
				{
					t=t*10+(double) ((int) temp[j]-48);
				}
				s = Math.acos(0)*Math.pow(t, 2)/4;
				System.out.printf("%.4f\n", s);
			}
		}
	}

}