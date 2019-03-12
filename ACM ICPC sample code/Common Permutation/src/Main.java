
import java.util.Scanner;


class Main
{
	public static void main(String[] args)
	{
		String s1;
		String s2;
		Character c1,c2;
		String common;
		Character[] al = new Character[26];
		al[0]='a';
		al[1]='b';
		al[2]='c';
		al[3]='d';
		al[4]='e';
		al[5]='f';
		al[6]='g';
		al[7]='h';
		al[8]='i';
		al[9]='j';
		al[10]='k';
		al[11]='l';
		al[12]='m';
		al[13]='n';
		al[14]='o';
		al[15]='p';
		al[16]='q';
		al[17]='r';
		al[18]='s';
		al[19]='t';
		al[20]='u';
		al[21]='v';
		al[22]='w';
		al[23]='x';
		al[24]='y';
		al[25]='z';
		int[] count1 = new int[26];
		int[] count2 = new int[26];
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		while(input.hasNext())
		{
			s1=input.nextLine();
			s2=input.nextLine();
			common="";
			//index1.clear();
			//index2.clear();
			for(int i=0 ; i<26 ; i++)
			{
				count1[i]=0;
				count2[i]=0;
				for(int j=0 ; j<s1.length() ; j++)
				{
					c1=new Character(s1.charAt(j));
					if(c1.equals(al[i]))
					{
						count1[i]++;
						//System.out.println("test");
					}
				}
				for(int j=0 ; j<s2.length() ; j++)
				{
					c2=new Character(s2.charAt(j));
					if(c2.equals(al[i]))
					{
						count2[i]++;
						//System.out.println("test");
					}
				}
				if(count1[i]>0 && count2[i]>0)
				{
					for(int k=0 ; k<Math.min(count1[i],count2[i]) ; k++)
					{
						common=common+""+al[i];
					}
				}
					
			}
			System.out.println(common);
		}
	}

}
