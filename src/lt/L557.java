package lt;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class L557 {
	public static String reverseWords(String s) {
		List<String> list = new LinkedList<>();
		String[] str = s.split("\\s");
		String ReverseS = "";
		String NewReverse = "";
		for (String NewS : str) {
			StringBuilder MyStringBuilder = new StringBuilder(NewS);
			ReverseS = MyStringBuilder.reverse().toString();
			list.add(ReverseS);

		}
		/*
		//Iterator		
		Iterator it = list.iterator();
		while(it.hasNext()){
			NewReverse+=" ";
			NewReverse+=it.next();
		}
		*/
		
		for(String ListS : list){
			NewReverse+=" ";
			NewReverse+=ListS;
		}
		
		String ReturnReverse = NewReverse.substring(1);
		 System.out.println(ReturnReverse);
		return ReturnReverse;

	}

}
