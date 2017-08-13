package lt;

import java.util.HashSet;
import java.util.Set;

public class L217 {
	public static boolean containsDuplicate(int[] nums) {
		Set<Integer> set = new HashSet<>();
		if (nums == null) {
			System.out.println("OK");
			return false;
		} else {
			for (int i : nums) {
				if (!set.contains(i)) {
					set.add(i);
				} else
					return true;
			}
			return false;
		}

	}

}
