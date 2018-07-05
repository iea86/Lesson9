package by.epam.javabasic25.classes;

public class SchoolBook extends EducationBook{
	private String subject;
	
	public SchoolBook(String title, int yearPublished, String author, String EducationalInstitution, String subject) {
		super(title,yearPublished,author, EducationalInstitution);
		this.subject = subject;
		}
	
	public String getsubject()
	{
	return subject;
	}
	
}
