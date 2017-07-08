package parse;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import alphabet.Alphabet;
import model.Letter;
import model.Word;

public class ParseFile {
	
	public static List<Word> words(){
	List<Word> words= new ArrayList<Word>();

	String plik = "enable1.txt";
	
	try(Scanner sc = new Scanner(new File(plik))) {
		
		while(sc.hasNext()) {
			String word = sc.next();
			char[] lettersChar=word.toCharArray();
			int[] values= Alphabet.setValues(lettersChar);
			
			Letter[] letters= new Letter[lettersChar.length];
			for(int i=0; i<lettersChar.length; i++){
				Letter l= new Letter(lettersChar[i], values[i]);
				letters[i]=l;
			}
			Word w= new Word(letters);
			words.add(w);
		}
		
		
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	return words;
	}
	
	public static void newFile(List<Word> wordsCipher){
		
	File file = new File("enable2.txt");
	
	String text=generateText(wordsCipher);
	
	    try(FileWriter fw = new FileWriter(file)) {
	        fw.write(text);
	        fw.close();
	
	    } catch (IOException e) {
	        e.printStackTrace();
	}
	    System.out.println("Powstał plik z zaszyfrowanymi słowami");
	}

	private static String generateText(List<Word> wordsCipher) {
		String text="";
		
		for (Word word : wordsCipher) {
			text+=Word.generateWord(word);
		}
		
		return text;
	}
	
}

