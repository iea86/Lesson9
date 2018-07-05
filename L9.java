package by.epam.javabasic25.classes;

public class L9 {
	
public static void main(String[] args) {
	
PrintedEdition myprintededition = new PrintedEdition("Print Edition Name",2000);
PrintedBook myprintedbook = new PrintedBook("Book Name",2006,"author");
Brochure mybrochure = new Brochure("Brochure Name",2009, "weekly");

EducationBook myeducationbook = new EducationBook("Education Book",2003, "Author", "Education");
SchoolBook myscholbook = new SchoolBook("School Book",2003, "Author", "School", "Math");
ProffessionalBook myproffessionalbook = new ProffessionalBook("Proffessional Book",2003, "Author", "University", "Artificial Intelligence");

Dictionary mydictionary = new Dictionary("Dictionary Name", 2000, "Author", "Dictionary");
LanguageDictionary mylanguagedictionary = new LanguageDictionary("Dictionary Name", 2000, "Author", "Translating", "From English","To Russian");
OrthographicDictionary myorthographicDictionary = new OrthographicDictionary("Dictionary Name", 2000, "Author", "Orthographic", "Russian language");

Journal myjournal = new Journal ("journal Name", 2000, "weekly","for kids");
KidsJournal mykidsjournal = new KidsJournal ("journal Name", 2000, "weekly","for kids", "older than 5 years");
ArtJournal myartjournal = new ArtJournal ("journal Name", 2000, "weekly","art", "Modern Art");

System.out.println("-----------");

System.out.println("Edition Title: " + myprintededition.getTitle() 
                 +  "\n" + "Year: " + myprintededition.getYearPublished());
System.out.println("-----------");
//Book
System.out.println("Book Title: " + myprintedbook.getTitle() 
+  "\n" + "Year: " + myprintedbook.getYearPublished()
+  "\n" + "Author: " + myprintedbook.getauthor());
System.out.println("-----------");
System.out.println("Education Book Title: " +  myeducationbook.getTitle() 
+  "\n" + "Year: " +  myeducationbook.getYearPublished()
+  "\n" + "Author: " +  myeducationbook.getauthor()
+  "\n" + "Type: " +  myeducationbook.getEducationalInstitution()
);
System.out.println("-----------");
System.out.println("School Book Title: " +  myscholbook.getTitle() 
+  "\n" + "Year: " +  myscholbook.getYearPublished()
+  "\n" + "Auhtor: " +  myscholbook.getauthor()
+  "\n" + "Type: " +  myscholbook.getEducationalInstitution()
+  "\n" + "Subject: " +  myscholbook.getsubject()
);
System.out.println("-----------");
System.out.println("Proffessional Book Title: " +  myproffessionalbook.getTitle() 
+  "\n" + "Year: " +  myproffessionalbook.getYearPublished()
+  "\n" + "Author: " +  myproffessionalbook.getauthor()
+  "\n" + "Type: " +  myproffessionalbook.getEducationalInstitution()
+  "\n" + "Degree: " +  myproffessionalbook.getdegree()
);
System.out.println("-----------");

System.out.println("Dictionary Title: " +  mydictionary.getTitle() 
+  "\n" + "Year: " +  mydictionary.getYearPublished()
+  "\n" + "Author: " +  mydictionary.getauthor()
+  "\n" + "Type: " +  mydictionary.getDictionaryType()
);
System.out.println("-----------");

System.out.println("Language Dictinary Title: " +  mylanguagedictionary.getTitle() 
+  "\n" + "Year: " +  mylanguagedictionary.getYearPublished()
+  "\n" + "Author: " +  mylanguagedictionary.getauthor()
+  "\n" + "Type: " +  mylanguagedictionary.getDictionaryType()
+  "\n" + "Language From: " +  mylanguagedictionary.getlanguagefrom()
+  "\n" + "Language To: " +  mylanguagedictionary.getlanguageto()
);
System.out.println("-----------");

System.out.println("Orthographic Dictionary Title: " +  myorthographicDictionary.getTitle() 
+  "\n" + "Year: " +  myorthographicDictionary.getYearPublished()
+  "\n" + "Author: " +  myorthographicDictionary.getauthor()
+  "\n" + "Type: " +  myorthographicDictionary.getDictionaryType()
+  "\n" + "Language: " +  myorthographicDictionary.getlanguage()
);
System.out.println("-----------");

System.out.println("Brochure: " + mybrochure.getTitle() 
+  "\n" + "Year: " + mybrochure.getYearPublished()
+  "\n" + "Periodicity: " + mybrochure.getperiodicity());
	
System.out.println("-----------");

System.out.println("Journal: " + myjournal.getTitle() 
+  "\n" + "Year: " + myjournal.getYearPublished()
+  "\n" + "Periodicity: " + myjournal.getperiodicity()
);	

System.out.println("-----------");

System.out.println("Journal: " + mykidsjournal.getTitle() 
+  "\n" + "Year: " + mykidsjournal.getYearPublished()
+  "\n" + "Periodicity: " + mykidsjournal.getperiodicity()
+  "\n" + "Age: " + mykidsjournal.getage()
);

System.out.println("-----------");

System.out.println("Journal: " +  myartjournal.getTitle() 
+  "\n" + "Year: " +  myartjournal.getYearPublished()
+  "\n" + "Periodicity: " +  myartjournal.getperiodicity()
+  "\n" + "Type of art: " +  myartjournal.getarttype()
);

}
}