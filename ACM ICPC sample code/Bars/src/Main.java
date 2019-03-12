import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in=new Scanner(System.in);
		int length,counter,i,j,n,p,t=in.nextInt();
		int[] bars;
		boolean isPossible;
		for(i=0;i<t;i++){
			n=in.nextInt();
			p=in.nextInt();
			bars=new int[p];
			for(j=0;j<p;j++)
				bars[j]=in.nextInt();
			counter=1;
			isPossible=false;
			loop:
				while(counter<=Math.pow(2,p))
				{
					length=0;
					for(j=0;j<p;j++)
					{
						if(Math.pow(2,j)>counter)
							break;
						if(counter%Math.pow(2,j+1)>=Math.pow(2,j))
						{
							length+=bars[j];
							if(length>n)
								break;
							if(length==n)
							{
								isPossible=true; 
								break loop;
							}
						}
					}
					counter++;
				}
			if(n==0||isPossible)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}