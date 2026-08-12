import java.util.*;
class LeetCode_645 {
    public int[] findErrorNums(int[] nums) {
        int[] ans = new int[2];
        HashSet<Integer> set = new HashSet<>();
        int dup=0;
        for(int n:nums)
        {
            if(set.contains(n)){
                dup =n;
            }
            set.add(n);
        }

        for(int i=1;i<=nums.length;i++){
            if(!set.contains(i)){
                ans[1] =i;
                break;
            }
        }
        ans[0] = dup;
        return ans;
    }
}