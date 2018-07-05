package by.epam.javabasic25.classes;

public class ProffessionalBook extends EducationBook{
		private String degree;
	
	public ProffessionalBook(String title, int yearPublished, String author, String EducationalInstitution, String degree) {
		super(title,yearPublished,author, EducationalInstitution);
		this.degree = degree;
		}
	
	public String getdegree()
	{
	return degree;
	}
	
}
