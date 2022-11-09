import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Class to store and access archaic words from a dictionary.
 * Uses a hash map to store items.
 * @author Zachary Cowan
 * @version 11/8/22
 * Fall/2022
 */
public class ArchaicDictionary {

	/**
	 * Stores dictionary entries.
	 */
	private HashMap<String, String> dict = new HashMap<String, String>();
	
	/**
	 * Reads two files, one for keys and one for values.
	 * Uses the two files to populate the dict HashMap.
	 */
	ArchaicDictionary() {
		try {
			File keysFile = new File("archaicKeys.txt");
			Scanner keysReader = new Scanner(keysFile);
			File valuesFile = new File("archaicValues.txt");
			Scanner valuesReader = new Scanner(valuesFile);
			
			//Read files and put in HashMap
			while (keysReader.hasNextLine() && valuesReader.hasNextLine() ) {
				dict.put(keysReader.nextLine(), valuesReader.nextLine());
			}
			
			keysReader.close();
			valuesReader.close();
		} 
		catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
	
	
	
	
	//
	//Methods for accessing
	/**
	 * Get the translation of specified key.
	 * @param archaicWord word to translate
	 * @return value stored in hash map for specific key.
	 */
	public String getTranslation(String archaicWord) {
		return dict.get(archaicWord);
	}
	
	/**
	 * Prints all words and definitions stored in hash map.
	 */
	public void printDictionary() {
		for( String key : dict.keySet() ) {
			System.out.println(key + " - " + dict.get(key));
		}
	}
	
	/**
	 * Search for a word in dictionary.
	 * Prints the word, definition, and hash code if the word exists.
	 * @param archaicWord word to search for.
	 */
	public void searchFor(String archaicWord) {
		if( dict.containsKey(archaicWord) ) {
			System.out.println("Archaic Word:\t" + archaicWord);
			System.out.println("Definition:\t" + dict.get(archaicWord));
			System.out.println("Hashkey Used:\t" + archaicWord.hashCode());
		}
		else {
			System.out.println("Couldnt find \"" + archaicWord + "\"");
		}
		System.out.println();
	}
}
