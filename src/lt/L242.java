package lt;

import java.util.Arrays;

public class L242 {
	public static boolean isAnagram(String s, String t) {
		char[] NewS =new char[100];
		char[] NewT =new char[100];
		for (int i=0;i<s.length();i++){
			NewS[i]=s.charAt(i);
		}
		for (int i=0;i<t.length();i++){
			NewT[i]=t.charAt(i);
		}
		Arrays.sort(NewS);
		Arrays.sort(NewT);
		if(NewS.equals(NewT))
			return true;
		else
			return false;

	}
}
