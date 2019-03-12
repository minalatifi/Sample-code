//Accepted
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
	    Queue<Integer> color1 = new LinkedList<>();
	    Queue<Integer> color2 = new LinkedList<>();
	    @SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
	    int[][] graph;
	    int[] col;
	    int n;
	    int x,y;
	    int p;
	    int index;
	    boolean check=false;
	    while(input.hasNext())
	    {
	    	n=input.nextInt();
	    	if(n==0)
	    		break;
	    	check=false;
	    	col=new int[n];
	    	Arrays.fill(col, 0);
	    	graph=new int[n][n];
	    	for(int i=0 ; i<n ; i++)
	    		for(int j=0 ; j<n ; j++)
	    			graph[i][j]=0;
	    	while(input.hasNext())
	    	{
	    		x=input.nextInt();
	    		y=input.nextInt();
	    		if(x==0 && y==0)
	    			break;
	    		graph[x-1][y-1]=1;
	    		graph[y-1][x-1]=1;
	    	}
	    	//
	    	color1.clear();
	    	color2.clear();
	    	color1.add(0);
	    	for(int i=0 ; i<n ; i++)
	    	{
	    		if(color2.isEmpty() && !color1.isEmpty())
	    		{
	    			p=color1.size();
	    			for(int k=0 ; k<p ; k++)
	    			{
	    				index=color1.poll();
	    				if(col[index]==0)
	    				{
	    					col[index]=1;
	    					for(int j=0 ; j<n ; j++)
		    				{
		    					if(graph[index][j]==1)
		    						color2.add(j);
		    				}
	    				}
	    				else if(col[index]==2)
	    				{
	    					check=true;
	    					break;
	    				}
	    				
	    			}
	    		}
	    		else if(color1.isEmpty() && !color2.isEmpty())
	    		{
	    			p=color2.size();
	    			for(int k=0 ; k<p ; k++)
	    			{
	    				index=color2.poll();
	    				if(col[index]==0)
	    				{
	    					col[index]=2;
	    					for(int j=0 ; j<n ; j++)
		    				{
		    					if(graph[index][j]==1)
		    						color1.add(j);
		    				}
	    				}
	    				else if(col[index]==1)
	    				{
	    					check=true;
	    					break;
	    				}
	    				
	    			}
	    		}
	    		else
	    			break;
	    	}
	    	if(check)
	    		System.out.println("NO");
	    	else
	    		System.out.println("YES");
	    }
	}
}
