package lt;

/**
 * Created by Lin Tao on 6/1/2017.
 */
public class L35 {
    public int searchInsert(int[] nums, int target) {
        if (nums[0] > target) {
            return 0;
        } else if (nums[nums.length - 1] < target) {
            return nums.length;
        }

        for (int i = 0; i < nums.length; i++) {
        if (nums[i] == target) {
        return i;
        } else if (nums[i] < target & nums[i + 1] > target) {
        return i + 1;
        }

        }


        return 0;
    }


}
