package lt;

/**
 * Created by Lin Tao on 5/30/2017.
 */
public class L495 {
    public static int findPoisonedDuration(int[] timeSeries, int duration) {
        int count = 0;
        for(int i=0;i<timeSeries.length;i++){
            int j=0;
            if(j<timeSeries.length-1){
                j=i+1;
            }


            if(timeSeries[j]<duration){
                count+=timeSeries[j];
            }
            else{
                count+=duration;
            }
        }
        return count;
    }

}
