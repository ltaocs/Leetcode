package lt;

/**
 * Created by Lin Tao on 7/1/2017.
 */
public class L633 {
    public boolean judgeSquareSum(int c) {
        int i = 0;
        int j = (int) Math.sqrt(c);
        while (i <= j) {
            int d = (int) (Math.pow(i, 2) + Math.pow(j, 2));
            if (d == c) {
                return true;
            } else if (d < c) {
                i++;
            } else if (d > c) {
                j--;
            }
        }
        return false;
    }
}
