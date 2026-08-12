import java.util.*;
public class LeetCode_260 {
    public static void main(String[] args) {
        int[] nums = {1,2,1,3,2,5};
        int[] ans = singleNumber(nums);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] singleNumber(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2];
        if(n==2) return nums;
        int xor = 0;
        for(int e:nums){
            xor ^= e;
        }
        int x2=0;
        int x1=0;
        int mask = xor & (-xor);
        for(int ele : nums){
            if((ele & mask) == 0){
                x1 ^= ele;
            }else{
                x2 ^= ele;
            }
        }
        ans[0] = x1;
        ans[1] =x2;
        return ans;
    }
}
