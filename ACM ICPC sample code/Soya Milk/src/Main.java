import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		double l,w,h;
		double degree;
		double v;
		@SuppressWarnings("resource")
		Scanner input =  new Scanner(System.in);
		while(input.hasNext())
		{
			l=input.nextDouble();
			w=input.nextDouble();
			h=input.nextDouble();
			degree=input.nextDouble()*Math.acos(-1)/180;
			if(l*Math.tan(degree)<=h)
			{
				v=l*w*h;
				v=v-(l*l*Math.tan(degree)/2)*w;
			}
			else
				v=h*(Math.tan(Math.acos(0)-degree))*h*w/2;
			
			System.out.printf("%.3f",v);
			System.out.print(" mL");
			System.out.println();
		}
	}

}
