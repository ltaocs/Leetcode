package lt;

/**
 * Created by Lin Tao on 7/5/2017.
 */
public class L633BruteForce {
    public boolean judgeSquareSum(int c) {
        int i=0;
        int j=0;
        for (i = 0; i < c; i++) {
            for (j = 0; j < c; j++) {
                System.out.println(i);
                if (i * i + j * j == c) {
                    return true;
                }
            }
        }

        return false;
    }
}
