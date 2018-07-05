package by.epam.javabasic25.classes;

public class Journal extends Brochure{
	private String  type;
	
	public Journal(String title, int yearPublished, String  periodicity, String type) {
	super(title, yearPublished, periodicity);
	this.type =type;			
	}
	
	public String gettype()
	{
	return type;
	}
}

