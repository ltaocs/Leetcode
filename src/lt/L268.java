package lt;

public class L268 {
public static int missingNumber(int[] nums) {
	int count = 0;
	int newcount = 0;
	for (int i : nums){
		count +=i;
	}
	for (int i=0;i<nums.length;i++){
		newcount += i;
	}
	return newcount-count;
        
    }
}
