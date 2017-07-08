package alphabet;

import java.util.ArrayList;
import java.util.List;

import model.Letter;

public class Alphabet {
	
	private static final char[] letters={'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 
			'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
	private static final int[] values={0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18,
			19, 20, 21, 22, 23, 24, 25};
	
	public static List<Letter> generateAlphabet(){
		List<Letter> alphabet= new ArrayList<Letter>();

		for(int i=0; i<26; i++){
			Letter l= new Letter(letters[i], values[i]);
			alphabet.add(l);
		}
		
		return alphabet;
	}
	
	public static int[] setValues(char letters[]){
		int[] values= new int[letters.length];
		int index=0;
		
		for (char letter : letters) {
			int value= setValue(letter);
			values[index]=value;
			index++;
		}
		
		return values;
	}
	
	private static int setValue(char letter){
		int value=0;
		
		for (int i=0; i<26; i++) {
			if(letter==letters[i]){
				value=values[i];
			}
		}
		
		return value;
	}
	
	public static char setLetter(int value){
		char letter = 0;
		
		for (int i=0; i<26; i++) {
			if(value==values[i]){
				letter=letters[i];
			}
		}
		
		return letter;
	}
	
}
