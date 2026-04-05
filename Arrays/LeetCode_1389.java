import java.util.*;
class LeetCode_1389 {
    public int[] createTargetArray(int[] nums, int[] index) {
        int n = nums.length;
        int[] ans = new int[n];
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<n; i++){
            arr.add(index[i],nums[i]);
        }
        for(int i=0; i<n; i++){
            ans[i] = arr.get(i);
        }
        return ans;
    }
}