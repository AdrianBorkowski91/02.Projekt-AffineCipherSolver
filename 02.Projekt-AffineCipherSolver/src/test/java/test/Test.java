package test;

import org.junit.Assert;

import alphabet.Alphabet;
import cipher.Cipher;
import model.Letter;
import model.Word;

public class Test {

	@org.junit.Test
	public void test() {

		//Stworzenie słowa KOT
		char lettersChar[]= {'k', 'o', 't'};
		int valueInt[]=Alphabet.setValues(lettersChar);
		Letter[] kotLetters= new Letter[3];
		
		for (int i=0; i<3; i++) {
			kotLetters[i]= new Letter(lettersChar[i], valueInt[i]);
		}
		
		Word kotWord= new Word(kotLetters);
		
		//Stworzenie zaszyfrowanego słowa KOT
		char lettersChar2[]= {'x', 'z', 'i'};
		int valueInt2[]=Alphabet.setValues(lettersChar2);
		Letter[] kotLetters2= new Letter[3];
		
		for (int i=0; i<3; i++) {
			kotLetters2[i]= new Letter(lettersChar2[i], valueInt2[i]);
		}
		
		Word kotWord2= new Word(kotLetters2);
		
		//Stworzenie zaszyfrowanego słowa KOT przez program
		Word kotNew= Cipher.newWordCipher(kotWord);
		
		Assert.assertEquals(Word.generateWord(kotNew), Word.generateWord(kotWord2));
	}
	
	

}
