package mk.iwec.hangmen;

import java.util.Random;
import java.util.Scanner;

public class Hangman {
	private static final char ASTERISK = '*';
	private int chances;
	private Scanner in;
	private String hiddenWord;
	private int hiddenLetters;
	private String displayWord;
	
	public Hangman(int chances) {
		this.chances = chances;
		in = new Scanner(System.in);
		
		defineHiddenWord();
		prepareDispayWord();
	}
	
	private void defineHiddenWord() {
		String[] words = {"Academy", "course","programming","Java","software"};
		Random rnd = new Random();
		hiddenWord = words [rnd.nextInt(words.length)];
	}	
	
	private void prepareDispayWord() {
		char[] temp= hiddenWord.toCharArray();
		for (int i=1; i < temp.length - 1; i++) {
			temp [i] = ASTERISK;
		}
		hiddenLetters = hiddenWord.length() - 2;
		displayWord = String.valueOf(temp);
	}
	private void checkLetter(char letter) {
		char[] hiddenWordAsArray = hiddenWord.toCharArray();
		char[] displayWordAsArray = displayWord.toCharArray();
		for( int i=1; i <hiddenWordAsArray.length -1; i++) {
			if(hiddenWordAsArray[i] == letter) {
				displayWordAsArray[i]= letter;
				hiddenLetters --;
			}
		}
		displayWord = String.valueOf(displayWordAsArray);
	}
	public String play() {
		int i=1;
		while (i>= chances) {
			System.out.println(displayWord);
			System.out.println("Enter a letter "+ i );
			char letter = in.next().charAt(0);
			checkLetter(letter);
			
			if (hiddenLetters == 0) {
				if (i== chances) {
					return "It's a draw"; 
				} else {
					return "The player has won";
				}
			}	
			i++;
		}
		return "the computer has won";
	}
	
	
}
