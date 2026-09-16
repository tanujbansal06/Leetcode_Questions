import java.util.HashSet;

public class LeetCode_128 {
    public static void main(String[] args) {
        int[] nums = {0,3,7,2,5,8,4,6,0,1};
        System.out.println(longestConsecutive(nums));
    }

    public static int longestConsecutive(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for(int i =0;i<nums.length;i++){
            set.add(nums[i]);
        }

        int ans =0;
        for(int i =0;i<nums.length;i++){
            int x = nums[i];
            if(set.contains(x) && !set.contains(x-1)){
                int c = 0;
                while(set.contains(x)){
                    c++;
                    set.remove(x);
                    x++;
                }
                ans = Math.max(ans, c);
            }
        }
        return ans;
    }
}
