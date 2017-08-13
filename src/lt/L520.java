package lt;

public class L520 {
	public static boolean detectCapitalUse(String word) {
		int A_count = 0;
		int B_count = 0;
		int C_count = 0;
		
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z') {
				A_count++;
			} else if (word.charAt(i) >= 'a' && word.charAt(i) <= 'z') {
				B_count++;
			}

		}

		if (word.charAt(0) >= 'A' && word.charAt(0) <= 'Z') {
			for (int i = 1; i < word.length(); i++) {
				if (word.charAt(i) >= 'a' && word.charAt(i) <= 'z') {
					C_count++;
				}
			}
		}
		if(A_count==word.length()){
			return true;
		}
		if(B_count==word.length()){
			return true;
		}
		if(C_count==word.length()-1){
			return true;
		}

		return false;

	}

}
