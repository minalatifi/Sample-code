import java.util.Scanner;


class Main
{
	public static void main(String args[])
	{
		int N;
		String line;
		Character[][] H;
		int code;
		int m;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		N=input.nextInt();
		for(int i=0 ; i<N ; i++)
		{
			line=input.next();
			m=line.length();
			H = new Character[10][m];
			for(int j=0 ; j<10 ; j++)
			{
				for(int k=0 ; k<line.length() ; k++)
				{
					H[j][k]=0;
					H[j][k]=line.charAt(k);
				}
				if(j!=9)
					line=input.next();	
			}
			
			for(int k=1 ; k<line.length()-1 ; k++)
			{
				code=0;
				for(int j=1 ; j<9 ; j++)
				{
					if(H[j][k].equals('\\'))
						code+=(int) Math.pow(2 , j-1);
				}
				System.out.print((char) code);
			}
			System.out.println();
		}
	}
}
