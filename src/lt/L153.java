package lt;

/**
 * Created by Lin Tao on 6/1/2017.
 */
public class L153 {
    public static int findMin(int[] nums) {
        int L = 0;
        int R = nums.length - 1;



        while (L < R & nums[L] > nums[R]) {
            int M = (L + R) / 2;
            if (nums[M] < nums[R]) {
                R = M;
            } else {
                L = M+1;
            }

        }
        return nums[L] ;
    }
}
