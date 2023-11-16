
/**
 * Imports a text file of words and definitions into a hashmap and prints them.
 */

/**
 * @author Brandon Esarey
 * @version 5.0 Assignment 5.1 CS215 Semester year Fall 2023
 */
import java.util.HashMap;
import java.io.*;

public class Dictionary {


	/**
	 * @throws IOException
	 * Uploads a list of archaic words and dictionaries into a HashMap, then prints
	 * them alongside five chosen words.
	 */
	public void fillDictionary() throws IOException {
		BufferedReader dictionary = new BufferedReader(new FileReader("OldWords.txt"));
		String row;
		HashMap<String, String> words = new HashMap<String, String>();
		while ((row = dictionary.readLine()) != null) {
			int eIndex = (row.indexOf("	"));
			String word = row.substring(0, eIndex);
			String definition = row.substring(eIndex);
			words.put(word, definition);
		} // end while
		for (String i : words.keySet())
			System.out.println(i + "" + words.get(i));
		System.out.println();
		String entry1 = words.get("wast");
		String entry2 = words.get("nigh");
		String entry3 = words.get("sap");
		String entry4 = words.get("verily");
		String entry5 = words.get("salamander");
		System.out.println("Wast: " + entry1);
		System.out.println("Nigh: " + entry2);
		System.out.println("Sap: " + entry3);
		System.out.println("Verily: " + entry4);
		System.out.println("Salamander: " + entry5);
		dictionary.close();
	}// end fillDictionary()

}// end Dictionary
