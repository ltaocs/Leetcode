package lt;

import java.util.Arrays;

/**
 * Created by Lin Tao on 6/10/2017.
 */
public class L611 {
    public int triangleNumber(int[] nums) {
        int count = 0;
        Arrays.sort(nums);

        for (int i = nums.length - 1; i > 0; i--) {
            for (int l=0; l < i; l++) {
                for (int r = l+1; r<i; r++) {
                    if (nums[i]<nums[l]+nums[r]) {
                        count=count+i-r;
                        break;
                    }
                }
            }
        }


        return count;

    }

    public boolean isTriangle(int a, int b, int c) {
        //if (a + b > c && a + c > b && b + c > a && a - b < c && a - c < b && b - c < a && b - a < c && c - a < b && c - b < a) {
        if (a + b > c && a + c > b && b + c > a) {
            return true;
        }
        return false;
    }
}


/*
//brute force
for (int i = 0; i < nums.length - 2; i++) {
    for (int j = i + 1; j < nums.length - 1; j++) {
    for (int q = j + 1; q < nums.length; q++) {
    if (isTriangle(nums[i], nums[j], nums[q]) == true) {
    count++;
    } else {
    break;
    }
    }
    }
    }*/
