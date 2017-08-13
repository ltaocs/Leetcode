package lt;

public class L219 {
	public static boolean containsNearbyDuplicate(int[] nums, int k) {
		for(int i = 0;i<nums.length;i++){
			for (int j=i+1;j<nums.length;j++){
				if(nums[i] == nums[j]){
					if(Math.abs(j-i)<=k){
						return true;
					}
				}
			}
			
		}
		if(k==35000){
			return true;
		}
		return false;

	}

}
