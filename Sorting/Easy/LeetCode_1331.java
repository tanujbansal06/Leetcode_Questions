import java.util.*;
class LeetCode_1331 {
    public int[] arrayRankTransform(int[] arr) {
        int[] res = arr.clone();
        Arrays.sort(res);
        
        HashMap<Integer,Integer> map = new HashMap<>();
        int rank=1;
        for(int ele:res){
            if(!map.containsKey(ele)){
                map.put(ele,rank++);
            }
        }
        int[] ans = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            ans[i] = map.get(arr[i]);
        }
        return ans;
        
    }
}