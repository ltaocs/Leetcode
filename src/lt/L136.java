package lt;

public class L136 {
	public static int singleNumber(int[] nums) {
		int result = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i++; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					break;
				} else {
					result = nums[i];
				}
			}

		}

		return result;
		/*
		 * int result = 0; for (int i : nums){ result ^= i; //return result; }
		 * return result;
		 * 
		 * 
		 */

	}

}
