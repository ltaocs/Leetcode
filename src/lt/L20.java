package lt;

import java.util.Hashtable;

public class L20 {
	public static boolean isValid(String s) {
		char[] char_s = s.toCharArray();
		Hashtable<Character, Character> hash = new Hashtable<>();
		hash.put('[', ']');
		hash.put('{', '}');
		hash.put('(', ')');

		for (int c = 0; c < char_s.length; c = c + 2) {
			try {
				
				
				if (hash.get(char_s[c]) != char_s[c + 1]) {
					return false;			

				}

			} catch (ArrayIndexOutOfBoundsException e) {
				return false;

			}
			catch (NullPointerException e) {
				return false;

			}
		}

		return true;

	}

}
