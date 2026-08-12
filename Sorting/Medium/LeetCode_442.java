import java.util.*;
class LeetCode_442 {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        //HashSet<Integer> set = new HashSet<>();
        // for(int n:nums){
        //     if(set.contains(n)){
        //         list.add(n);
        //     }
        //     set.add(n);
        // }
        for(int i = 0; i < nums.length; i++){
            int index = Math.abs(nums[i]) - 1;

            if(nums[index] < 0){
                list.add(Math.abs(nums[i]));
            } else {
                nums[index] = -nums[index];
            }
        }

        return list;
    }
}