import java.util.HashMap;
import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		HashMap<Integer, Integer> grid = new HashMap<Integer, Integer>();
		int i, x, j, n, t = in.nextInt();
		String r;
		for (i = 1; i <= t; i++)
		{
			grid.clear();
			r = "yes";
			n = in.nextInt();
			for (j = 0; j < n * n; j++)
			{
				x = in.nextInt();
				if (grid.containsKey(x))
					grid.put(x, grid.get(x) + 1);
				else
					grid.put(x, 1);
			}
			for (int k : grid.values())
				if (k > n)
					r = "no";
			System.out.println("Case " + i + ": " + r);
		}
	}
}
