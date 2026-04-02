import java.util.Arrays;
import java.util.HashMap;

public class LeetCode_137 {
    public static void main(String[] args) {
        int nums[] = {1,2,2,2,1,3,1};
        System.out.println(singleNumber(nums));
    }
    public static int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans =0;
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        for(int key : map.keySet()){
            if(map.get(key)==1){
                ans = key;
            }
        }
        return ans;
        // int result = 0;
        // for(int i = 0; i < 32; i++){
        //     int sum = 0;
        //     for(int num : nums){
        //         if(((num >> i) & 1) == 1){
        //             sum++;
        //         }
        //     }
        //     if(sum % 3 != 0){
        //         result |= (1 << i);
        //     }
        // }
        // return result;
    }
}
