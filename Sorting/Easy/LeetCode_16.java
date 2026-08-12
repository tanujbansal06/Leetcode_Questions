import java.util.*;
class LeetCode_16 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int csum = nums[0]+nums[1]+nums[2];
        for(int i=0;i<nums.length-2;i++){
            int left = i+1;
            int right = nums.length-1;
            while(left<right){
                int s = nums[i]+nums[left]+nums[right];
                if( Math.abs(target-s) < Math.abs(target-csum)){
                    csum = s;
                }
                if(s>target){
                    right--;
                }else if(s<target){
                    left++;
                }else{
                    return s;
                }
            }
        }
        return csum;

    }
}