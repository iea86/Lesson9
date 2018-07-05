package by.epam.javabasic25.classes;

	public class LanguageDictionary extends Dictionary{
			private String languagefrom;
			private String languageto;
		
		public LanguageDictionary(String title, int yearPublished, String author, String  DictionaryType, String languagefrom,String languageto ) {
			super(title,yearPublished,author, DictionaryType);
			this.languagefrom = languagefrom;
			this.languageto = languageto;
			}
		
		public String getlanguagefrom()
		{
		return languagefrom;
		}
		
		public String getlanguageto()
		{
		return languageto;
		}
		
	}

