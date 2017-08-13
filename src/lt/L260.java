package lt;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Lin Tao on 5/30/2017.
 */
public class L260 {
    public static int[] singleNumber(int[] nums) {
        int[] TwiceNums = new int[2];
        int count = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums){
            if (!set.contains(i)) {
                set.add(i);
            }
            else {
                TwiceNums[count]=i;
                count++;
            }

        }

        return TwiceNums;


    }
}
