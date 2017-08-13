package lt;

import java.util.Arrays;

/**
 * Created by Lin Tao on 7/22/2017.
 */
public class L645 {
    public int[] findErrorNums(int[] nums) {
        int[] returnArray = new int[2];
        Arrays.sort(nums);
        for (int i = nums[0]; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                returnArray[0] = nums[i];
            }
            if (nums[i] != nums[i] + i) {
                returnArray[1] = nums[i] + i-1;
            }
        }
        return returnArray;
    }
}
