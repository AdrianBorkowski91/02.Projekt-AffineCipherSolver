package model;

import java.util.Arrays;

public class Word {

	private Letter[] letters;
	
	public Word(Letter[] letters) {
		this.letters = letters;
	}

	public Word(){}
	
	public Letter[] getLetters() {
		return letters;
	}

	public void setLetters(Letter[] letters) {
		this.letters = letters;
	}

	public static String generateWord(Word word){
		String wordString="";
		
		for (Letter letter : word.getLetters()) {
			wordString+=letter.getLetter();
		}
		
		wordString+=System.lineSeparator();
		
		return wordString;
	}
	
	@Override
	public String toString() {
		return "Word [letters=" + Arrays.toString(letters) + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(letters);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Word other = (Word) obj;
		if (!Arrays.equals(letters, other.letters))
			return false;
		return true;
	}

	
	
	
}
