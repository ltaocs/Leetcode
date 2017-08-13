package lt;

/**
 * Created by Lin Tao on 5/31/2017.
 */
public class L343 {


    public static int integerBreak(int n) {
        int product = 1;
        if (n == 2) {
            return 1;
        } else if (n == 3) {
            return 2 ;
        }
        while(n>4){
            product*=3;
            n=n-3;
        }
        product*=n;


        return product;

    }
}
