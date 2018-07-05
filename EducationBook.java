package by.epam.javabasic25.classes;

public class EducationBook extends PrintedBook {
	private String EducationalInstitution;
	
	public EducationBook(String title, int yearPublished, String author, String EducationalInstitution) {
		super(title,yearPublished,author);

	this.EducationalInstitution = EducationalInstitution;
	}
	
	public String getEducationalInstitution()
	{
	return EducationalInstitution;
	}
	}
