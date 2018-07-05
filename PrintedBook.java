package by.epam.javabasic25.classes;

public class PrintedBook extends PrintedEdition{
	private String  author;
	
	public PrintedBook(String title, int yearPublished, String author) {
	setTitle(title);
	setYearPublished(yearPublished);

	this.author= author;
	}
	
	public String getauthor()
	{
	return author;
	}
}
