import java.text.SimpleDateFormat;
import java.util.Date;


public class Note 
{
	private String topic;
	private String title;
	private String text;
	private String date;
	private Date nDate = new Date();
	private SimpleDateFormat ft = new SimpleDateFormat ("yyyy.MM.dd_'at'_hh:mm:ss");
	
	public Note (String to,String ti,String te)
	{
		setTopic(to);
		setTitle(ti);
		setText(te);
		date=ft.format(nDate);
	}
	public Note (String to,String ti,String te,String d)
	{
		setTopic(to);
		setTitle(ti);
		setText(te);
		date=d;
	}
	
	public int searchByTopic(String value)
	{
		int result = 0;
		if (0 == value.compareTo(topic));
		{
			result = 1;
		}
		if (0 != value.compareTo(topic))
		{
			result = 0;
		}
		return result;
	}
	
	public int searchByTitle(String value)
	{
		
		int result = 0;
		if (0 == value.compareTo(title));
		{
			result = 1;
		}
		if (0 != value.compareTo(title))
		{
			result = 0;
		}
		return result;
	}
	
	public int searchByText(String value)
	{
		int result = 0;
		if (0 == value.compareTo(text));
		{
			result = 1;
		}
		if (0 != value.compareTo(text))
		{
			result = 0;
		}
		return result;
	}
	

	public void setText(String text) 
	{
		this.text = text;
	}

	public void setTitle(String title) 
	{
		this.title = title;
	}

	public void setTopic(String topic) 
	{
		this.topic = topic;
	}
	
	public String getTopic()
	{
		return topic;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public String getText()
	{
		return text;
	}
	
	public String getDate()
	{
		return date;
	}
	
	public void printNote()
	{
		System.out.println(date);
		System.out.println("Topic:" + topic);
		System.out.println("	Title:" + title);
		System.out.println("		Text:" + text);
	}

}
