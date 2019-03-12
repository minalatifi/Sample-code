import java.util.ArrayList;
import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		ArrayList<String> l = new ArrayList<String>(92);
		l.add("04752613"); l.add("05726314"); l.add("06357142"); l.add("06471352"); 
		l.add("13572064"); l.add("14602753"); l.add("14630752"); l.add("15063724"); 
		l.add("15720364"); l.add("16257403"); l.add("16470352"); l.add("17502463"); 
		l.add("20647135"); l.add("24170635"); l.add("24175360"); l.add("24603175"); 
		l.add("24730615"); l.add("25147063"); l.add("25160374"); l.add("25164073"); 
		l.add("25307461"); l.add("25317460"); l.add("25703641"); l.add("25704613"); 
		l.add("25713064"); l.add("26174035"); l.add("26175304"); l.add("27360514"); 
		l.add("30471625"); l.add("30475261"); l.add("31475026"); l.add("31625704"); 
		l.add("31625740"); l.add("31640752"); l.add("31746025"); l.add("31750246"); 
		l.add("35041726"); l.add("35716024"); l.add("35720641"); l.add("36074152"); 
		l.add("36271405"); l.add("36415027"); l.add("36420571"); l.add("37025164"); 
		l.add("37046152"); l.add("37420615"); l.add("40357162"); l.add("40731625"); 
		l.add("40752613"); l.add("41357206"); l.add("41362750"); l.add("41506372"); 
		l.add("41703625"); l.add("42057136"); l.add("42061753"); l.add("42736051"); 
		l.add("46027531"); l.add("46031752"); l.add("46137025"); l.add("46152037"); 
		l.add("46152073"); l.add("46302751"); l.add("47302516"); l.add("47306152"); 
		l.add("50417263"); l.add("51602473"); l.add("51603742"); l.add("52064713"); 
		l.add("52073164"); l.add("52074136"); l.add("52460317"); l.add("52470316"); 
		l.add("52613704"); l.add("52617403"); l.add("52630714"); l.add("53047162"); 
		l.add("53174602"); l.add("53602417"); l.add("53607142"); l.add("57130642"); 
		l.add("60275314"); l.add("61307425"); l.add("61520374"); l.add("62057413"); 
		l.add("62714053"); l.add("63147025"); l.add("63175024"); l.add("64205713"); 
		l.add("71306425"); l.add("71420635"); l.add("72051463"); l.add("73025164");
		int[] q = new int[8];
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int index=0;
		int temp;
		int[] r = new int[92];
		while(input.hasNext())
		{
			index++;
			for(int i=0 ; i<8 ; i++)
				q[i]=input.nextInt();
			for(int i=0 ; i<92 ; i++)
			{
				temp=0;
				for(int j=0 ; j<8 ; j++)
				{
					if(q[j]-1!=(int) l.get(i).charAt(j)-48)
						temp++;
				}
				r[i]=temp;
			}
			temp=r[0];
			for(int i=1 ; i<92 ; i++)
			{
				if(r[i]<temp)
					temp=r[i];
			}
			
			System.out.println("Case "+index+": "+temp);
		}
	}	
}