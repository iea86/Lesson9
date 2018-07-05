package by.epam.javabasic25.classes;

public class OrthographicDictionary extends Dictionary{
		private String language;
			
	public OrthographicDictionary(String title, int yearPublished, String author, String  DictionaryType, String language) {
		super(title,yearPublished,author, DictionaryType);
		this.language = language;		
		}
	
	public String getlanguage()
	{
	return language;
	}
	
	
}

