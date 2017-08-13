/**
 * 
 */
package lt;

/**
 * @author txl78
 *
 */
public class L485 {
	public static int findMaxConsecutiveOnes(int[] nums) {
		int count = 0;
		int max = 0;
		//for (int i : nums) {
		for (int i = 0; i<nums.length; i++){	
		if (nums[i] == 1) {
				count++;
			}
			else{
				max = Math.max(max, count);
				count = 0;
			}
		}
		System.out.println(Math.max(max, count));

		return Math.max(max, count);

	}

}
