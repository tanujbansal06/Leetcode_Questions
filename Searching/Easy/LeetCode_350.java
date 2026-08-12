import java.util.*;
class LeetCode_350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums1){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int ele:nums2){
            if(map.containsKey(ele) && map.get(ele)>0){
                list.add(ele);
                map.put(ele,map.get(ele)-1);
            }
        }

        int[] ans = new int[list.size()];
        int k =0;
        for(int i :list){
            ans[k++]=i;
        }
        return ans;
    }
}