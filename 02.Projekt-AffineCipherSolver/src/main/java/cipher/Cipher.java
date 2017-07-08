package cipher;

import java.util.ArrayList;
import java.util.List;

import alphabet.Alphabet;
import model.Letter;
import model.Word;

public class Cipher {

	public static List<Word> cipherWords(List<Word> words) {
		List<Word> wordsCipher= new ArrayList<Word>();
		
		for (Word word : words) {
			Word newWord= newWordCipher(word);
			wordsCipher.add(newWord);
		}

		return wordsCipher;
	}

	public static Word newWordCipher(Word word) {
		Letter[] newLetters= new Letter[word.getLetters().length];
		int index=0;
		
		for (Letter letter : word.getLetters()) {
			
			int value=letter.getValue();
			int a=7*value+5;
			int newValue=a%26;
			
			char newLetter= Alphabet.setLetter(newValue);
			
			Letter l= new Letter(newLetter, newValue);
			newLetters[index]= l;
			index++;
		}
		
		Word newWord= new Word(newLetters);
		
		return newWord;
	}

	
}
