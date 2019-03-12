import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		double cow;
		double car;
		double show;
		double p;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		while(input.hasNext())
		{
			cow=input.nextDouble();
			car=input.nextDouble();
			show=input.nextDouble();
			p=(cow/(cow+car))*(car/(cow+car-show-1)) + (car/(cow+car))*((car-1)/(car+cow-show-1));
			System.out.printf("%.5f\n",p);
		}
	}

}
