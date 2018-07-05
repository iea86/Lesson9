package by.epam.javabasic25.classes;

public class ArtJournal extends Journal{
		private String arttype;
		
	public ArtJournal(String title, int yearPublished, String periodicity, String type, String arttype) {
		super(title, yearPublished, periodicity, type);
		this.arttype = arttype;
		
		}
	
	public String getarttype()
	{
	return arttype;
	}
	
	
}

