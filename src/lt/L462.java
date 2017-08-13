package lt;

import java.time.Clock;

/**
 * Created by Lin Tao on 5/30/2017.
 */
public class L462 {
    public static int minMoves2(int[] nums) {
        double total=0;
        int step=0;
        for (int i :nums){
            total+=i;
        }

        double aver=total/nums.length;
        long average = Math.round(aver);
        //System.out.println(average);
        for(int i :nums){
            step+=Math.abs(i-average);
        }


        return step;


    }
}
