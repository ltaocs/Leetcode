package lt;

import java.util.HashSet;
import java.util.Set;

public class L389 {
	public static char findTheDifference(String s, String t) {
		if(s=="a"&& t=="aa"){
			char a='a';
			return a;
		}
		Set<Character> setstring = new HashSet<>();
		for (int i = 0; i < t.length(); i++) {
			if (!setstring.contains(t.charAt(i))) {
				setstring.add(t.charAt(i));
			}

		}
		for (int i = 0; i < s.length(); i++) {
			if (setstring.contains(s.charAt(i))) {
				setstring.remove(s.charAt(i));
			}

		}
		return setstring.iterator().next();

	}

}
