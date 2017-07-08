package model;

public class Letter {

	private char letter;
	private int value;
	
	public Letter(char letter, int value) {
		this.letter = letter;
		this.value = value;
	}
	
	public Letter(){}

	public char getLetter() {
		return letter;
	}

	public void setLetter(char letter) {
		this.letter = letter;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Letter [letter=" + letter + ", value=" + value + "]";
	}
	
	
}
