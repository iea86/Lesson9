package by.epam.javabasic25.classes;

public class KidsJournal extends Journal{
		private String age;
		
		
	public KidsJournal(String title, int yearPublished, String periodicity, String type, String age) {
		super(title, yearPublished, periodicity, type);
		this.age = age;
		
		}
	
	public String getage()
	{
	return age;
	}
	
	
}
