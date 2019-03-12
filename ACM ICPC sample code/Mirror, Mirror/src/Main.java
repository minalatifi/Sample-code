import java.util.Scanner;


public class Main 
{
	public static void main(String[] args) 
	{
		int n;
		Character[][] original;
		Character[][] transformed;
		Character[][] temp;
		String row1;
		String row2;
		int counter=0;
		boolean b = false;
		boolean im = false;
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext())
		{
			n = input.nextInt();
			counter++;
			b=false;
			im=false;
			original = new Character[n][n];
			transformed = new Character[n][n];
			temp = new Character[n][n];
			for(int i=0 ; i<n ; i++)
			{
				row1 = input.next();
				row2 = input.next();
				for(int j=0 ; j<n ; j++)
				{
					original[i][j] = row1.charAt(j);
					transformed[i][j] = row2.charAt(j);
				}
			}
			//Preservation
			for(int k=0 ; k<n ; k++)
			{
				for(int j=0 ; j<n ; j++)
				{
					if(original[k][j]!=transformed[k][j])
					{
						b=false;
						break;
					}
					else if(original[k][j]==transformed[k][j])
						b=true;
				}
				if (!b)
					break;
			}
			if(b)
			{
				System.out.println("Pattern "+counter+" was preserved.");
				im=true;
			}
			b=false;
			//90 Degree Rotation
			for(int k=0 ; k<n ; k++)
			{
				for(int j=0 ; j<n ; j++)
				{
					if(original[k][j]!=transformed[j][n-1-k])
					{
						b=false;
						break;
					}
					else if(original[k][j]==transformed[j][n-1-k])
						b=true;
				}
				if (!b)
					break;
			}
			if(b)
			{
				if (!im)
				{
				System.out.println("Pattern "+counter+" was rotated 90 degrees.");
				im=true;
				}
			}
			b=false;
			//180 Degree Rotation
			for(int k=0 ; k<n ; k++)
			{
				for(int j=0 ; j<n ; j++)
				{
					if(original[k][j]!=transformed[n-1-k][n-1-j])
					{
						b=false;
						break;
					}
					else if(original[k][j]==transformed[n-1-k][n-1-j] && original[k][j]!=transformed[k][j])
						b=true;
				}
				if (!b)
					break;
			}
			if(b)
			{
				if(!im)
				{
				System.out.println("Pattern "+counter+" was rotated 180 degrees.");
				im=true;
				}
			}
			b=false;
			//270 Degree Rotation
			for(int k=0 ; k<n ; k++)
			{
				for(int j=0 ; j<n ; j++)
				{
					if(original[k][j]!=transformed[n-1-j][k])
					{
						b=false;
						break;
					}
					else if(original[k][j]==transformed[n-1-j][k])
						b=true;
				}
				if (!b)
					break;
			}
			if(b)
			{
				if(!im)
				{
				System.out.println("Pattern "+counter+" was rotated 270 degrees.");
				im=true;
				}
			}
			b=false;
			//vertical reflection
			for(int k=0 ; k<n ; k++)
			{
				for(int j=0 ; j<n ; j++)
				{
					if(original[k][j]!=transformed[n-1-k][j])
					{
						b=false;
						break;
					}
					else if(original[k][j]==transformed[n-1-k][j] && !(original[k][j]==transformed[n-1-k][n-1-j]))
						b=true;
				}
				if (!b)
					break;
			}
			if(b)
			{
				if(!im){
				System.out.println("Pattern "+counter+" was reflected vertically.");
				im=true;}
			}
			b=false;
			//combination
			for(int k=0 ; k<n ; k++)
			{
				for(int j=0 ; j<n ; j++)
				{
					temp[k][j] = original[n-1-k][j];
				}
			}
			//1
			for(int k=0 ; k<n ; k++)
			{
				for(int j=0 ; j<n ; j++)
				{
					if(temp[k][j]!=transformed[j][n-1-k])
					{
						b=false;
						break;
					}
					else if(temp[k][j]==transformed[j][n-1-k])
						b=true;
				}
				if (!b)
					break;
			}
			if(b)
			{
				if(!im)
				{
					im=true;
					System.out.println("Pattern "+counter+" was reflected vertically and rotated 90 degrees.");
				}
			}
			b=false;
			//2
			for(int k=0 ; k<n ; k++)
			{
				for(int j=0 ; j<n ; j++)
				{
					if(temp[k][j]!=transformed[n-1-k][n-1-j])
					{
						b=false;
						break;
					}
					else if(temp[k][j]==transformed[n-1-k][n-1-j] && temp[k][j]!=transformed[k][j])
						b=true;
				}
				if (!b)
					break;
			}
			if(b)
			{
				if(!im)
				{
					im=true;
					System.out.println("Pattern "+counter+" was reflected vertically and rotated 180 degrees.");
				}
				
			}
			b=false;
			//3
			for(int k=0 ; k<n ; k++)
			{
				for(int j=0 ; j<n ; j++)
				{
					if(temp[k][j]!=transformed[n-1-j][k])
					{
						b=false;
						break;
					}
					else if(temp[k][j]==transformed[n-1-j][k])
						b=true;
				}
				if (!b)
					break;
			}
			if(b)
			{
				if(!im)
				{
					im=true;
					System.out.println("Pattern "+counter+" was reflected vertically and rotated 270 degrees.");
				}
			}
			b=false;
			//improper
			if(!im)
				System.out.println("Pattern "+counter+" was improperly transformed.");
			
		}
	}

}
