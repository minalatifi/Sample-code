import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main
{
	public static void main(String[] args)
	{
		ArrayList<Integer> distance = new ArrayList<Integer>();
		int n;
		boolean B = false;
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		while (input.hasNext())
		{
			n = input.nextInt();
			if (n==0)
				break;
			distance.removeAll(distance);
			for(int i=0 ; i<n ; i++)
			{
				distance.add(input.nextInt());
			}
			Collections.sort(distance);
			for (int i=0 ; i<n-1 ; i++)
			{
				if (distance.get(i+1)-distance.get(i)>200 || 1422-distance.get(n-1)>100)
				{
					B = true;
					break;
				}
			}
			
			if (B)
				System.out.println("IMPOSSIBLE");
			else if(!B)
				System.out.println("POSSIBLE");
			B=false;
		}
	}

}
