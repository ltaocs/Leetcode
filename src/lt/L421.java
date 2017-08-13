package lt;

/**
 * Created by Lin Tao on 5/31/2017.
 */
public class L421 {
    public static int findMaximumXOR(int[] nums) {
        int max = 0;
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                int xor = i ^ j;
                max = Math.max(max, xor);
            }
        }
        return max;
    }
}
