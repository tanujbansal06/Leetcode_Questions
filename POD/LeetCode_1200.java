//26 jan 2026
import java.util.*;
class LeetCode_1200 {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(arr);
        int mind = Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
            mind=Math.min(mind,arr[i]-arr[i-1]);
        }

        for(int i=1;i<arr.length;i++){
            int a = arr[i-1];
            int b = arr[i];
            int d = b-a;
            if(d==mind){
                res.add(Arrays.asList(a,b));
            }
        }
        return res;
    }
}