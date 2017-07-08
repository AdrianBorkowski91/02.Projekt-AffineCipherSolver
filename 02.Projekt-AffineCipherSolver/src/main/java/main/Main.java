package main;

import java.util.List;

import cipher.Cipher;
import model.Word;
import parse.ParseFile;

public class Main {

	public static void main(String[] args) {
	
		List<Word> words= ParseFile.words();
		List<Word> wordsCipher= Cipher.cipherWords(words);
		ParseFile.newFile(wordsCipher);
		
	}

}
