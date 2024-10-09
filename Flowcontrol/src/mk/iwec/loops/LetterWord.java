package mk.iwec.loops;

public class LetterWord {

	public int findLetter (String word, char letter) {
		int result= 0;
		for (int i =0; i < word.length(); i++ ) {
			if (word.charAt(i) == letter) {
				result++;
			}
		}
		return result;
	}
}
