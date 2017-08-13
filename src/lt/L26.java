package lt;

/**
 * Created by Lin Tao on 5/29/2017.
 */
public class L26 {
    public static int removeDuplicates(int[] nums) {
        int position = 0;
        for (int i = 0; i<nums.length; i++){
            for (int j = 0; j<=i; j++){
                if (nums[i]!=nums[j]){
                   nums[position]=nums[i];
                   if(position<nums.length){
                       position ++;
                   }

                }
            }
        }
        if(position==0){
            return 1;
        }

        return position;
    }
}
