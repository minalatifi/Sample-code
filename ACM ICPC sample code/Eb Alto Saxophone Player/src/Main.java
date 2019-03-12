import java.util.Scanner;


class Main
{
	public static void main(String[] args)
	{
		int n;
		int note1 = -1,note2 = -1;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int[][] note = new int[14][10];
		int[] finger = new int[10];
		finger[0] = 0;
		finger[1] = 0;
		finger[2] = 0;
		finger[3] = 0;
		finger[4] = 0;
		finger[5] = 0;
		finger[6] = 0;
		finger[7] = 0;
		finger[8] = 0;
		finger[9] = 0;
		char[] code = new char[14];
		code[0] = 'c';
		code[1] = 'd';
		code[2] = 'e';
		code[3] = 'f';
		code[4] = 'g';
		code[5] = 'a';
		code[6] = 'b';
		code[7] = 'C';
		code[8] = 'D';
		code[9] = 'E';
		code[10] = 'F';
		code[11] = 'G';
		code[12] = 'A';
		code[13] = 'B';
		//c
		note[0][0]=0;
		note[0][1]=1;
		note[0][2]=1;
		note[0][3]=1;
		note[0][4]=0;
		note[0][5]=0;
		note[0][6]=1;
		note[0][7]=1;
		note[0][8]=1;
		note[0][9]=1;
		//d
		note[1][0]=0;
		note[1][1]=1;
		note[1][2]=1;
		note[1][3]=1;
		note[1][4]=0;
		note[1][5]=0;
		note[1][6]=1;
		note[1][7]=1;
		note[1][8]=1;
		note[1][9]=0;
		//e
		note[2][0]=0;
		note[2][1]=1;
		note[2][2]=1;
		note[2][3]=1;
		note[2][4]=0;
		note[2][5]=0;
		note[2][6]=1;
		note[2][7]=1;
		note[2][8]=0;
		note[2][9]=0;
		//f
		note[3][0]=0;
		note[3][1]=1;
		note[3][2]=1;
		note[3][3]=1;
		note[3][4]=0;
		note[3][5]=0;
		note[3][6]=1;
		note[3][7]=0;
		note[3][8]=0;
		note[3][9]=0;
		//g
		note[4][0]=0;
		note[4][1]=1;
		note[4][2]=1;
		note[4][3]=1;
		note[3][4]=0;
		note[4][5]=0;
		note[4][6]=0;
		note[4][7]=0;
		note[4][8]=0;
		note[4][9]=0;
		//a
		note[5][0]=0;
		note[5][1]=1;
		note[5][2]=1;
		note[5][3]=0;
		note[5][4]=0;
		note[5][5]=0;
		note[5][6]=0;
		note[5][7]=0;
		note[5][8]=0;
		note[5][9]=0;
		//b
		note[6][0]=0;
		note[6][1]=1;
		note[6][2]=0;
		note[6][3]=0;
		note[6][4]=0;
		note[6][5]=0;
		note[6][6]=0;
		note[6][7]=0;
		note[6][8]=0;
		note[6][9]=0;
		//C
		note[7][0]=0;
		note[7][1]=0;
		note[7][2]=1;
		note[7][3]=0;
		note[7][4]=0;
		note[7][5]=0;
		note[7][6]=0;
		note[7][7]=0;
		note[7][8]=0;
		note[7][9]=0;
		//D
		note[8][0]=1;
		note[8][1]=1;
		note[8][2]=1;
		note[8][3]=1;
		note[8][4]=0;
		note[8][5]=0;
		note[8][6]=1;
		note[8][7]=1;
		note[8][8]=1;
		note[8][9]=0;
		//E
		note[9][0]=1;
		note[9][1]=1;
		note[9][2]=1;
		note[9][3]=1;
		note[9][4]=0;
		note[9][5]=0;
		note[9][6]=1;
		note[9][7]=1;
		note[9][8]=0;
		note[9][9]=0;
		//F
		note[10][0]=1;
		note[10][1]=1;
		note[10][2]=1;
		note[10][3]=1;
		note[10][4]=0;
		note[10][5]=0;
		note[10][6]=1;
		note[10][7]=0;
		note[10][8]=0;
		note[10][9]=0;
		//G
		note[11][0]=1;
		note[11][1]=1;
		note[11][2]=1;
		note[11][3]=1;
		note[11][4]=0;
		note[11][5]=0;
		note[11][6]=0;
		note[11][7]=0;
		note[11][8]=0;
		note[11][9]=0;
		//A
		note[12][0]=1;
		note[12][1]=1;
		note[12][2]=1;
		note[12][3]=0;
		note[12][4]=0;
		note[12][5]=0;
		note[12][6]=0;
		note[12][7]=0;
		note[12][8]=0;
		note[12][9]=0;
		//B
		note[13][0]=1;
		note[13][1]=1;
		note[13][2]=0;
		note[13][3]=0;
		note[13][4]=0;
		note[13][5]=0;
		note[13][6]=0;
		note[13][7]=0;
		note[13][8]=0;
		note[13][9]=0;
		////
		String s;
		char[] song;
		int i;
			n = input.nextInt();
				for (i=0 ; i<n ; i++)
				{
					s = input.next();
					song = s.toCharArray();
					for(int k=0 ; k<14 ; k++)
					{
						if(song[0] == code[k])
							note1=k;
					}
					for (int k=0 ; k<10 ; k++)
					{
						if (note[note1][k] == 1)
						{
							finger[k]++;
						}
					}
					for (int j=1 ; j<song.length ; j++)
					{
						for(int k=0 ; k<14 ; k++)
						{
							if(song[j]==code[k])
								note2=k;
							if(song[j-1]==code[k])
								note1=k;
						}
						for (int k=0 ; k<10 ; k++)
						{
							if (note[note2][k] == 1 && note[note1][k] != note[note2][k])
							{
								finger[k]++;
							}
						}
						
					}
					for(int j=0 ; j<10 ; j++)
					{
						System.out.print(finger[j]+" ");
						finger[j]=0;
					}
					note1=-1;
					note2=-1;
					System.out.println();
					
				}
	System.exit(0);
	}
}