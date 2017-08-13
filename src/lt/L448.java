package lt;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class L448 {
	public static List<Integer> findDisappearedNumbers(int[] nums) {
		Set<Integer> numset = new HashSet<>();
		List<Integer> numlist = new LinkedList<>();
		for (int i : nums){
			numset.add(i);
		}
		for (int i=1;i<=nums.length;i++){
			if(!numset.contains(i)){
				numlist.add(i);
			}

			
		}
		return numlist;

	}
}
