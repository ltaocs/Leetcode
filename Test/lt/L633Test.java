package lt;

import static org.junit.Assert.assertEquals;

/**
 * Created by Lin Tao on 7/1/2017.
 */
public class L633Test {
    @org.junit.Test
    public void judgeSquareSum() throws Exception {
        L633 l0 = new L633();
        int i0 = 4;
        boolean result;
        result = l0.judgeSquareSum(i0);

        int i1 = 2147482647;
        boolean result1 = l0.judgeSquareSum(i1);
        int i2 = 999999999;
        boolean result2 = l0.judgeSquareSum(i2);
        int i3 = 5;
        boolean result3 = l0.judgeSquareSum(i3);
        int i4 = 2;
        boolean result4 = l0.judgeSquareSum(i4);

        assertEquals(true, result);
        assertEquals(false, result1);
        assertEquals(true, result3);
        assertEquals(true, result4);
    }

}