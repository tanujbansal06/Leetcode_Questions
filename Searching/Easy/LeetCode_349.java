import java.util.*;
class LeetCode_349{
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> res = new HashSet<>();
        HashSet<Integer> set= new HashSet<>();
        for(int i :nums1){
            set.add(i);
        }
        for(int i:nums2){
            if(set.contains(i)){
                res.add(i);
            }
        }

        int ans[] =new int[res.size()];
        int k=0;
        for(int ele:res){
            ans[k++] = ele;
        }
        return ans;
    }
}
