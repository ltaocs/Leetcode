package lt;

import static org.junit.Assert.assertEquals;

/**
 * Created by Lin Tao on 6/17/2017.
 */
public class L624Test {
    @org.junit.Test
    public void maxDistance() throws Exception {

        L624 l0 = new L624();
        int[][] testArray0 = new int[][]{{1, 2, 3}, {4, 5}, {1, 2, 3}};
        int testValue0 = l0.maxDistance(testArray0);

        //[1],[1]
        L624 l1 = new L624();
        int[][] testArray1 = new int[][]{{1}, {1}};
        int testValue1 = l1.maxDistance(testArray1);

        L624 l2 = new L624();
        int[][] testArray2 = new int[][]{{1,4}, {0,5}};
        int testValue2 = l2.maxDistance(testArray2);

        assertEquals(4, testValue0);
        assertEquals(0, testValue1);
        assertEquals(4, testValue2);

    }

}