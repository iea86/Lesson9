package by.epam.javabasic25.classes;

public class Dictionary extends PrintedBook {
	private String  DictionaryType;
	
	public   Dictionary(String title, int yearPublished, String author, String  DictionaryType) {
		super(title,yearPublished,author);

	this.DictionaryType = DictionaryType;
	}
	
	public String getDictionaryType()
	{
	return DictionaryType;
	}
}


