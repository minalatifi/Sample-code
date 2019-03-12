import java.util.Scanner;


class Main 
{
	public static void main(String[] args) 
	{
		String days[] = {"Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday","Monday"};
		int doomDay[] ={10,21,7,4,9,6,11,8,5,10,7,12};
		int n;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int day;
		int mounth;
		
		n = input.nextInt();
		for(int i=0 ; i<n ; i++)
		{
			mounth = input.nextInt();
			day = input.nextInt();
			if(doomDay[mounth-1]==day)
			{
				System.out.println(days[6]);
			}
			else if (doomDay[mounth-1]>day)
			{
				day=(doomDay[mounth-1]-day)%7;
				System.out.println(days[6-day]);
			}
			else
			{
				day=(day-doomDay[mounth-1])%7;
				day=(6+day)%7;
				System.out.println(days[day]);
			}
		}
	}
}