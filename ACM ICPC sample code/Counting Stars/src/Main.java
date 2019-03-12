//Accepted :)
import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		int r,c;
		int[][] sky;
		int count;
		String row;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		while(input.hasNext())
		{
			r=input.nextInt();
			c=input.nextInt();
			if(r==0 && c==0)
				break;
			sky=new int[r+2][c+2];
			for(int i=1 ; i<=r ; i++)
			{
				row=input.next();
				for(int j=1 ; j<=c ; j++)
				{
					if(row.charAt(j-1)==46)
						sky[i][j]=0;
					else if(row.charAt(j-1)==42)
						sky[i][j]=1;
				}
			}
			for(int i=0 ; i<c+2 ; i++)
			{
				sky[r+1][i]=0;
				sky[0][i]=0;
			}
			for(int i=0 ; i<r+2 ; i++)
			{
				sky[i][0]=0;
				sky[i][c+1]=0;
			}
			//
			count=0;
			for(int i=1 ; i<=r ; i++)
				for(int j=1 ; j<=c ; j++)
					if(sky[i][j]==1)
						if(sky[i][j-1]==0 && sky[i][j+1]==0 && sky[i-1][j]==0 && sky[i+1][j]==0 && 
						sky[i-1][j-1]==0  && sky[i+1][j+1]==0 && sky[i+1][j-1]==0 && sky[i-1][j+1]==0)
							count++;
			System.out.println(count);		
		}
	}
}