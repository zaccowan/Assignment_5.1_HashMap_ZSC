/**
 * Application class to test ArchaicDictionary.
 * @author Zachary Cowan
 * @version 11/8/22
 * Fall/2022
 */
public class Application {
	/**
	 * Main execution
	 * @param args code to be ran
	 */
	public static void main(String [] args) {

		ArchaicDictionary dictionary = new ArchaicDictionary();
		
		//Get a translation for archaic word
		System.out.println( dictionary.getTranslation("plight"));
		System.out.println( dictionary.getTranslation("zac"));
		
		
		//Searches for archaic word and prints the word, definition, and hash code.
		dictionary.searchFor("nice");
		dictionary.searchFor("receipt");
		dictionary.searchFor("hither");
		dictionary.searchFor("leman");
		dictionary.searchFor("tenter");
		dictionary.searchFor("zac");
		
		//Prints entire dictionary
//		dictionary.printDictionary();
		
	}
}
