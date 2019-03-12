import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		ArrayList<Float> ds = new ArrayList<Float>();
		int f;
		int r;
		float temp;
		ArrayList<Integer> fs = new ArrayList<Integer>();
		ArrayList<Integer> rs = new ArrayList<Integer>();
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		while(input.hasNext())
		{
			ds.clear();
			fs.clear();
			rs.clear();
			f=input.nextInt();
			if(f==0)
				break;
			r=input.nextInt();
			for(int i=0 ; i<f ; i++)
				fs.add(input.nextInt());
			for(int i=0 ; i<r ; i++)
				rs.add(input.nextInt());
			for(int i=0 ; i<f ; i++)
			{
				for(int j=0 ; j<r ; j++)
				{
					ds.add((float) rs.get(j)/(float) fs.get(i));
				}
			}
			Collections.sort(ds);
			temp=0;
			for(int i=0 ; i<ds.size()-1 ; i++)
			{
				if(ds.get(i+1)/ds.get(i)>temp)
					temp=ds.get(i+1)/ds.get(i);
			}
			System.out.printf("%.2f\n" , temp);
		}
	}

}
