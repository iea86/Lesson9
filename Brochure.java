package by.epam.javabasic25.classes;

public class Brochure extends PrintedEdition{
	private String  periodicity;
	
	public Brochure(String title, int yearPublished, String  periodicity) {
	setTitle(title);
	setYearPublished(yearPublished);

	this.periodicity = periodicity;
	}
	
	public String getperiodicity()
	{
	return periodicity;
	}
}


