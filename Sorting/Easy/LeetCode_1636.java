import java.util.*;
class LeetCode_1636 {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        Integer[] arr = new Integer[nums.length];
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            arr[i] = nums[i];
        }
        
        Arrays.sort(arr, (a,b) ->{
            int frea = map.get(a);
            int freb = map.get(b);
            if(frea==freb){
                return b-a;
            }
            return frea-freb;
        });

        for(int i=0;i<nums.length;i++){
            nums[i] =arr[i];
        }

        return nums;

    }
}