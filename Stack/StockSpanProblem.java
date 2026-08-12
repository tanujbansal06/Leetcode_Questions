// public class StockSpanProblem {
    
// }
import java.util.*;
class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;
        // ans.add(1);
        // for(int i = 1; i < n; i++){
        //     int span = 0;
        //     for(int j = i-1; j >= 0; j--){
        //         if(arr[j] > arr[i]){
        //             span = i - j;
        //             break;
        //         }
        //     }
        //     if(span == 0){
        //         span = i + 1;
        //     }
        //     ans.add(span);
        // }
        
        // Stack<int[]> st = new Stack<>();
        // for(int i =0;i<n;i++){
        //     while(!st.isEmpty() && arr[i]>= st.peek()[1]){
        //         st.pop();
        //     }
        //     if(st.isEmpty()){
        //         ans.add(i+1);
        //     }else{
        //         ans.add(i-st.peek()[0]);
        //     }
        //     st.push(new int[] {i,arr[i]});
        // }  
        
        //ArrayDeque is faster than stack
        ArrayDeque<int[]> st = new ArrayDeque<>();
        for(int i =0;i<n;i++){
            while(!st.isEmpty() && arr[i] >= st.peek()[1]){
                st.pop();
            }
            if(st.isEmpty()){
                ans.add(i+1);
            }else{
                ans.add(i-st.peek()[0]);
            }
            st.push(new int[] {i,arr[i]});
        }
        return ans;
    }
}