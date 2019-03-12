/*
import java.util.LinkedList;
import java.util.Scanner;


class Main
{
	public static void main(String[] args)
	{
		int t;
		int temp = -1;
		int home = -1;
		int homeTemp=0;
		int end = -1;
		boolean b=false;
		String in;
		int s,s1,s2;
		LinkedList<Character> line = new LinkedList<Character>();
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		while(input.hasNext())
		{
			in=input.nextLine();
			b = false;
			line.removeAll(line);
			home=end=-1;
			homeTemp=0;
			for(int i=0 ; i<in.length() ; i++)
				line.add(in.charAt(i));
			t=in.length();
			s=s1=s2=0;
			for(int k=0 ; k<t ; k++)
			{
				if(line.get(k).equals(']'))
					s1++;
				if(line.get(k).equals('['))
					s2++;
			}
			if(s1>s2)
				s=s1;
			else
				s=s2;
			for(int k=0 ; k<=s ; k++)
			{
				for(int i=0 ; i<line.size() ; i++)
				{
					if(temp != -1 && home!=temp)
						homeTemp=temp;
					temp=home;
					if (line.get(i).equals('['))
						home=i;
					if (line.get(i).equals(']'))
						end=i;
					if(home>=0 && end>=0)
						break;
				}
				if(home==-1 && end==-1)
					b=true;
				if(!b)
				{
					if(home>=0 && end>=0 && end-home>1)
					{
					
						//t=0;
						for(int i=end-1 ; i>home ; i--)
						{
							if(homeTemp==0)
							{
								line.addFirst(line.get(end-1));
								line.remove(end);
							}
							else
							{
								line.add(homeTemp+1,line.get(end-1));
								line.remove(end);
							}
						}
						line.remove(end);
						line.remove(end-1);
						//t-=2;
					}
					else if(home>=0 && end>=0 && end-home==1)
					{
						line.remove(home);
						line.remove(home);
						//t-=2;
					}
					else
					{
						if(home==-1)
						{
							line.remove(end);
						}
						if(end==-1)
						{
							line.remove(home);
							for(int i=0 ; i<home ; i++)
							{
								line.addLast(line.get(0));
								line.remove(0);
							}
							
						}
						//t--;
					}
					home=end=-1;
					homeTemp=0;
					temp=-1;
				}
				else
				{
					for(int i=0 ; i<line.size() ; i++)
						System.out.print(line.get(i));
					System.out.println();
					break;
				}
			}
		}
	}

}
*/
import java.util.*;
import java.io.*;

class Main 
{
  public static void main(String[] args) throws IOException 
{
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    
    String line;
    while ((line = in.readLine()) != null) 
{
      char[] stream = line.toCharArray();
      boolean begin = false;
      StringBuilder cur = new StringBuilder();
      Deque<String> total = new ArrayDeque<String??);
      
      for (char c : stream) 
{
        if (c == '[') {
          if (begin)
            total.offerFirst(cur.toString());
          else
            total.offerLast(cur.toString());
          cur = new StringBuilder();
          begin = true;
        } else if (c == ']') {
          if (begin)
            total.offerFirst(cur.toString());
          else
            total.offerLast(cur.toString());
          cur = new StringBuilder();
          begin = false;
        } else {
          cur.append(c);
        }
      }
      if (begin)
        total.offerFirst(cur.toString());
      else
        total.offerLast(cur.toString());
      
      StringBuilder res = new StringBuilder();
      while (!total.isEmpty())
        res.append(total.pollFirst());
      
      System.out.println(res.toString());
    }
    
    in.close();
    System.exit(0);
  }
}