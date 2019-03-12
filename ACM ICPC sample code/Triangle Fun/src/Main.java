//Accepted3
import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		double x1;
		double y1;
		double x2;
		double y2;
		double x3;
		double y3;
		double tx1;
		double ty1;
		double tx2;
		double ty2;
		double tx3;
		double ty3;
		double a1,b1,c1;
		double a2,b2,c2;
		double a3,b3,c3;
		int s;
		int n;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		n=input.nextInt();
		for(int i=0 ; i<n ; i++)
		{
			x1=input.nextDouble();
			y1=input.nextDouble();
			x2=input.nextDouble();
			y2=input.nextDouble();
			x3=input.nextDouble();
			y3=input.nextDouble();
			
			tx1=(2*x1+x2)/3;
			ty1=(2*y1+y2)/3;
			tx2=(2*x2+x3)/3;
			ty2=(2*y2+y3)/3;
			tx3=(2*x3+x1)/3;
			ty3=(2*y3+y1)/3;
			
			if(x3-tx1!=0)
			{
				b1=-1;
				a1=(y3-ty1)/(x3-tx1);
				c1=ty1-a1*tx1;
			}
			else
			{
				b1=0;
				a1=1;
				c1=-tx1;
			}
			
			if(x1-tx2!=0)
			{
				b2=-1;
				a2=(y1-ty2)/(x1-tx2);
				c2=ty2-a2*tx2;
			}
			else
			{
				b2=0;
				a2=1;
				c2=-tx2;
			}
			
			if(x2-tx3!=0)
			{
				b3=-1;
				a3=(y2-ty3)/(x2-tx3);
				c3=ty3-a3*tx3;
			}
			else
			{
				b3=0;
				a3=1;
				c3=-tx3;
			}
			
			
			x1 = ((b2 * c1 - c2 * b1) / (a2 * b1 - b2 * a1));
			y1 = ((c2 * a1 - c1 * a2) / (a2 * b1 - b2 * a1));
			x2 = ((b2 * c3 - c2 * b3) / (a2 * b3 - b2 * a3));
			y2 = ((c2 * a3 - c3 * a2) / (a2 * b3 - b2 * a3));
			x1 = ((b3 * c1 - c3 * b1) / (a3 * b1 - b3 * a1));
			y1 = ((c3 * a1 - c1 * a3) / (a3 * b1 - b3 * a1));
			
			s=(int) Math.abs((x2*y3-x3*y2-x1*y3+x3*y1+x1*y2-x2*y1)/2 +0.5);
			System.out.println(s);
		}
		
	}

}
