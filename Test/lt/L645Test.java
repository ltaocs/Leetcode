package lt;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Lin Tao on 7/22/2017.
 */
public class L645Test {
    @Test
    public void findErrorNums() throws Exception {
        L645 l0 = new L645();
        int[] nums = {1, 2, 2, 4};
        int[] result;
        result = l0.findErrorNums(nums);
        int[]  Eresult= {2,3};
        boolean result0 = Eresult.equals(result);
        assertTrue(result0);
    }

}