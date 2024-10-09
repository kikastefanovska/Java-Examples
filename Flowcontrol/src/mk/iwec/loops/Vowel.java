package mk.iwec.loops;

public class Vowel {
	public static boolean isVowel(char letter) {
		String chLower = String.valueOf(letter).toLowerCase();
		if("a".equals(chLower) || "o".equals(chLower) ||"e".equals(chLower)|| "i".equals(chLower) || "u".equals(chLower))
				return true;
	
	return false;
}
}