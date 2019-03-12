import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		int x,y,z;
		int a,b,c;
		int n;
		boolean find;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		n= input.nextInt();
		for(int i=0 ; i<n ; i++)
		{
			a=input.nextInt();
			b=input.nextInt();
			c=input.nextInt();
			find=false;
			for(x=-100 ; x<=100 ; x++)
			{
				for(y=-100 ; y<=100 ; y++)
				{
					for(z=-100 ; z<=100 ; z++)
					{
						if(x+y+z==a && x*y*z==b && (int)(Math.pow(x,2)+Math.pow(y,2)+Math.pow(z,2))==c && (x!=y &&y!=z&&z!=x))
						{
							System.out.println(x+" "+y+" "+z);
							find=true;
							break;
						}
						if(find)
							break;
					}
					if(find)
						break;
				}
			}
			if(!find)
				System.out.println("No solution.");
		}
	}

}
