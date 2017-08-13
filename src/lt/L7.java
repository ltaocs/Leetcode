package lt;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class L7 {
	public static int reverse(int x) {
		List<Integer> list = new LinkedList<>();
		Integer Int;
		String str = null;
		String newstr = null;
		if(x>Math.pow(2, 32)){
			return 0;
		}
		else if(x>=0){
			Int = x;
			str=Int.toString();
			for(int i=0;i<str.length();i++){
				list.add((int) str.charAt(i));
			}
			
		}
		Collections.reverse(list);
		for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext();) {
			Integer i = iterator.next();
			newstr+=i;
		}
		int newX= Integer.parseInt(newstr);
		return newX;

	}

}
