import java.util.Scanner;

public class Test 
{
	public static void main(String[] args) 
	{
		NoteBook noteBook = new NoteBook();
		int choice;
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Please enter the number of your choice :");
		System.out.println("1. Add");
		System.out.println("2. Edit");
		System.out.println("3. Search");
		System.out.println("4. Remove");
		
		choice = scanner.nextInt();
		
		switch (choice)
		{
		case 1:
		{
			String topic;
			String title;
			String text;
			
			System.out.println("Please enter topic : ");
			topic = scanner.next();
			System.out.println("Please enter title : ");
			title = scanner.next();
			System.out.println("Please enter text : ");
			text = scanner.next();
			
			noteBook.add(topic, title, text);
			break;
		}
		case 2:
		{
			int result = 0;
			String title;
			System.out.println("Please enter note title you want to edit :");
			title = scanner.next();
			result = noteBook.search(2, title);
			
			if (result == 0)
			{
				System.out.println("The note not find.");
			}
			
			else
			
			{
				int x;
				String value;
				System.out.println("Enter the number of your choice :");
				System.out.println("1. Topic");
				System.out.println("2. Tiltle");
				System.out.println("3. Text");
				
				x = scanner.nextInt();
				System.out.println("Enter please :");
				value = scanner.next();
				noteBook.edit(x, title, value);
			}
			break;
		}
		case 3:
		{
			int x;
			String value;
			int result;
			
			System.out.println("Enter the number of your choice to search :");
			System.out.println("1. Topic");
			System.out.println("2. Tiltle");
			System.out.println("3. Text");
			
			x = scanner.nextInt();
			
			System.out.println("What you want to search? Pleas Enter. ");
			value = scanner.next();
			
			result = noteBook.search(x, value);
			if (result == 0)
			{
				System.out.println("The note not find.");
			}
			break;
		}
		case 4:
		{
			String title;
			System.out.println("Please enter the title :");
			title = scanner.next();
			
			noteBook.delete(title);
			break;
		}
		
		}
	}
}
