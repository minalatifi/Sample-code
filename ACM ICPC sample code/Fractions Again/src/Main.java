import java.util.ArrayList;
import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		int k;
		int x;
		int count;
		ArrayList<Integer> xs =  new ArrayList<Integer>();
		ArrayList<Integer> ys =  new ArrayList<Integer>();
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		while(input.hasNext())
		{
			k=input.nextInt();
			xs.clear();
			ys.clear();
			count=0;
			for(x=k+1 ; x<=2*k ; x++)
			{
				if((k*x) % (x-k) == 0)
				{
					xs.add(x);
					ys.add((k*x)/(x-k));
					count++;
				}
			}
			System.out.println(count);
			for(int i=0 ; i<count ; i++)
			{
				System.out.println("1/"+k+" = 1/"+ys.get(i)+" + 1/"+xs.get(i));
			}
		}
	}
}
