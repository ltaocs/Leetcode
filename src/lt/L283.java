package lt;

public class L283 {
public static void moveZeroes(int[] nums) {
	/*
	int[] newnums = {};
	int j = 0;
	for (int i=0;i<nums.length;i++){
		if(i != 0){
			
			newnums[j]=nums[i];
			j++;
		}
	}
	for(int a=j;a<nums.length;a++){
		newnums[a]=0;
		
	}
        for (int i=0;i<nums.length;i++){
        	nums[i]=newnums[j];
        }*/
	int j = 0;
	for(int i=0;i<nums.length;i++){
		if(nums[i]!=0){
			nums[j]=nums[i];
			j++;
		}
	}
	for (int i=j++;i<nums.length;i++){
		nums[i]=0;
	}
}

}
