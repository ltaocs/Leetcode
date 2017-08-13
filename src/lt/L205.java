package lt;

public class L205 {
	public static boolean isIsomorphic(String s, String t) {
		char[] CharS = s.toCharArray();
		char[] CharT = t.toCharArray();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != t.charAt(i)) {
				for (int j = i; j < s.length(); j++) {
					if (CharS[j] == CharS[i]) {
						CharS[j] = CharT[i];
					}

				}
			}

		}
		String NewS = String.valueOf(CharS);
		String NewT = String.copyValueOf(CharT);
		
		if (NewS.equals(NewT)) {
			return true;
		}
		else
		return false;
	}
}
