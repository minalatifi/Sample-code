
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;

public class NoteBook 
{
	private ArrayList<Note> notes = new ArrayList<Note>();
	public static int t=0;
	private int i=0;
	public void readFile()
	{
		try
		{
			FileReader reader = new FileReader("E:\\programming java\\Note Book\\src\\notes.txt");
			Scanner input = new Scanner(reader);
		
			
			System.out.println(t);
			while(input.hasNextInt())
			{
				t = input.nextInt();
				notes.add(new Note(input.next(),input.next(),input.next(),input.next()));
			}
			input.close();
			
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File is not found");
			System.exit(1);
		}
	}
	
	public void saveToFile()
	{
		try
		{
			t=notes.size();
			PrintWriter out = new PrintWriter("E:\\programming java\\Note Book\\src\\notes.txt");
			i=0;
			for(Note note : notes)
			{
				out.println(t-(t-i)+1);
				out.println(note.getTopic());
				out.println(note.getTitle());
				out.println(note.getText());
				out.println(note.getDate());
				i++;
			}
			out.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File is not found");
			System.exit(1);
		}
	}
	
	public void add(String topic,String title,String text)
	{
		readFile();
		
		notes.add(new Note(topic,title,text));
		t++;
		saveToFile();
	}
	
	public int search(int x,String value)
	{
		int result = 0,temp = 0;
		readFile();
		//topic
		if (x == 1)
		{
			for(Note note : notes)
			{
				result = note.searchByTopic(value);
				if (result == 1)
				{
					note.printNote();
					temp=1;
				}
			}
			result = temp;
			//saveToFile();
			return result;
		}
		//title
		else if (x == 2)
		{
			for(Note note : notes)
			{
				result = note.searchByTitle(value);
				
				if (result == 1)
				{
					note.printNote();
					break;
				}
			}
			//saveToFile();
			return result;
		}
		//text
		else
		{
			for(Note note : notes)
			{
				result = note.searchByText(value);
				if (result == 1)
				{
					note.printNote();
					temp =1;
				}
			}
			result = temp;
			//saveToFile();
			return result;
		}
	}
	
	public void delete(String title)
	{
		readFile();
		int result = 0;
		int i = -1;
		for(Note note : notes)
		{
			i++;
			result = note.searchByTitle(title);
			if (result == 1)
			{
				notes.remove(i);
				break;
			}
		}
		if (result == 0)
		{
			System.out.println("The note not find.");
		}
		saveToFile();
	}
	
	public void edit(int x,String firstValue,String secondValue)
	{
		//t=0;
		int result = 0;
		readFile();
		if (x ==1)
		{
			for(int j=0 ; j<notes.size() ; j++)
			{
				result = notes.get(j).searchByTitle(firstValue);
				if (result == 1)
				{
					notes.get(j).setTopic(secondValue);
					//note.printNote();
					break;
				}
			}
		}
		
		else if (x == 2)
		{
			for(Note note : notes)
			{
				result = note.searchByTitle(firstValue);
				if (result == 1)
				{
					note.setTitle(secondValue);
					//note.printNote();
					break;
				}
			}
		}
		
		else
		{
			for(Note note : notes)
			{
				result = note.searchByTitle(firstValue);
				if (result == 1)
				{
					note.setText(secondValue);
					//note.printNote();
					break;
				}
			}
		}
		this.saveToFile();
	}
	
	
}
