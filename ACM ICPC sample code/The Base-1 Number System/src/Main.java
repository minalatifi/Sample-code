import java.util.Scanner;


class Main
{
	public static void main(String[] args)
	{
		int flag = 0;
		String block;
		int[] binary;
		binary=new int[30];
		int number = 0;
		int len;
		int index=0;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		while(input.hasNext())
		{
			block=input.next();
			
			if(block.equals("~"))
				break;
			else if(block.equals("0"))
			{
				flag=1;
			}
			else if(block.equals("00"))
				flag=0;
			else if(block.length()>2)	
			{
				len=block.length()-2;
				for(int i=0 ; i<len ; i++)
				{
					binary[index]=flag;
					index++;
				}
			}
			else if(block.equals("#"))
			{
				number=0;
				int two=1;
				for(int i=index ; i>0 ; i--)
				{
					//System.out.print(binary[0]+" ");
					number=number+(binary[i-1]*two);
					two=two*2;
				}
				System.out.println(number);
				index=0;
			}
		}
	}

}
