import java.util.ArrayList;
import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		int n;
		int[] steps;
		int s;
		int oneCounter;
		int threeCounter;
		ArrayList<Integer> x1 = new ArrayList<Integer>();
		ArrayList<Integer> y1 = new ArrayList<Integer>();
		ArrayList<Integer> x3 = new ArrayList<Integer>();
		ArrayList<Integer> y3 = new ArrayList<Integer>();
		String line;
		@SuppressWarnings("resource")
		Scanner input =  new Scanner(System.in);
		while(input.hasNext())
		{
			n = input.nextInt();
			x1.clear();
			y1.clear();
			x3.clear();
			y3.clear();
			oneCounter=threeCounter=0;
			for(int i=0 ; i<n ; i++)
			{
				line=input.next();
				for(int j=0 ; j<n ; j++)
				{
					if((int) (line.charAt(j)-48)==1)
					{
						x1.add(i);
						y1.add(j);
						oneCounter++;
					}
					else if((int) (line.charAt(j)-48)==3)
					{
						x3.add(i);
						y3.add(j);
						threeCounter++;
					}
				}
			}
			steps = new int[oneCounter];
			for(int i=0 ; i<oneCounter ; i++)
			{
				s=2*(n-1);
				for(int j=0 ; j<threeCounter ; j++)
				{
					if(Math.abs(x3.get(j)-x1.get(i)) + Math.abs(y3.get(j)-y1.get(i))<s)
						s=Math.abs(x3.get(j)-x1.get(i)) + Math.abs(y3.get(j)-y1.get(i));
				}
				steps[i]=s;
			}
			s=steps[0];
			for(int i=1 ; i<steps.length ; i++)
				if(steps[i]>s)
					s=steps[i];
			System.out.println(s);
		}
	}
}
