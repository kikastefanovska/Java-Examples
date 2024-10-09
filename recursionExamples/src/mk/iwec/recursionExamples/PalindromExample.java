package mk.iwec.recursionExamples;

public class PalindromExample {

	public static boolean isPalindrome(String word) {
		if(word.length() == 0 || word.length() == 1)
			return true;
		if(word.charAt(0) == word.charAt(word.length()-1)) {
			return isPalindrome(word.substring(1, word.length()-1));
		}
		return false;
	}

	public static void main(String[] args) {
		String word = "ana";
		String word2 = "anaaa";
		System.out.println("ana is palindrome " + isPalindrome(word));
		System.out.println("anaaa is palindrome " + isPalindrome(word2));


	}

}
