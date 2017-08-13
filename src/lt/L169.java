package lt;

import java.util.HashMap;
import java.util.Hashtable;

public class L169 {
	public static int majorityElement(int[] nums) {
		int frequency = nums.length / 2;
		int elment = 0;
		int ret = 0;
		HashMap hash = new HashMap();
		for (int i = 0; i < nums.length; i++) {

			elment = nums[i];
			if (!hash.containsKey(elment)) {
				int count = 1;
				hash.put(elment, 1);

			} else {
				int count = (int) (hash.get(elment)) + 1;
				// hash.get
				hash.put(elment, count);
			}
			if ( (int)(hash.get(elment)) > frequency) {
				ret = elment;
				return ret;

			}
		}

		return ret;

	}

}
