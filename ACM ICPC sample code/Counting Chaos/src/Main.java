import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;


class Main
{
	public static void main(String[] args)
	{
		int n;
		String time;
		String H = "";
		String M = "";
		int hour;
		int min;
		GregorianCalendar gcalendar = new GregorianCalendar();
		gcalendar.set(Calendar.HOUR,00);
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		{
			n = input.nextInt();
			for(int i=0 ; i<n ; i++)
			{
				time = input.next();
				hour = (int) time.charAt(0) - 48;
				hour = 10*hour + (int)  time.charAt(1) - 48;
				min = (int) time.charAt(3) - 48;
				min = 10*min + (int)  time.charAt(4) - 48;

				for (int j=0 ; j<1000 ; j++)
				{
					min++;
					if (min == 60)
					{
						min = 0;
						hour++;
						if (hour == 24)
							hour = 0;
					}
					
					if (hour == 0)
					{
						if (min < 10)
							break;
						else
						{
							if (min % 11 == 0)
								break;
						}
					}
					else if (hour < 10)
					{
						if (hour == (min % 10))
							break;
					}
					else
					{
						if (hour/10 == min%10 && hour%10 == min/10)
							break;
					}
				}
				H = H +""+ (char) (hour/10 + 48);
				H = H +""+ (char) (hour%10 + 48);
				M = M +""+ (char) (min/10 + 48);
				M = M +""+ (char) (min%10 + 48);
				time = "";
				time = "" + H + ":" + M;
				System.out.println(time);
				time = "";
				H = "";
				M = "";
			}
		}
	}
}
