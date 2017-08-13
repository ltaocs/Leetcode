package lt;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class L438 {
	public  List<Integer> findAnagrams(String s, String p) {
		List<Integer> l = new LinkedList<>();
		String Sort_p = sort(p);
		for(int i=0;i<s.length()-p.length()+1;i++){
			String stringtest = s.substring(i, i+p.length());
			String Sort_s=sort(stringtest);
			if(Sort_s.equals(Sort_p)){
				l.add(i);
				
			}
			
		}

		return l;

	}
	public static String sort(String s){
		char[] chars = s.toCharArray();
		Arrays.sort(chars);
		String sorted = new String(chars);		
		return sorted;
		
	}

}
