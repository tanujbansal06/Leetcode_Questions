// public class LeetCode_84 {
    
// }
import java.util.*;
class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] arr1 = new int[n]; //ps
        int[] arr2 = new int[n]; //ns
        Stack<Integer> st = new Stack<>();

        // Previous Smaller
        for(int i = 0; i < n; i++){
            while(!st.isEmpty() && heights[st.peek()] >= heights[i]){
                st.pop();
            }
            if(st.isEmpty()){
                arr1[i] = -1;
            }else{
                arr1[i] = st.peek();
            }
            st.push(i);
        }

        // Next Smaller
        Stack<Integer> stt = new Stack<>();
        for(int i = n-1; i >= 0; i--){
            while(!stt.isEmpty() && heights[stt.peek()] >= heights[i]){
                stt.pop();
            }
            if(stt.isEmpty()){
                arr2[i] = n;
            }else{
                arr2[i] = stt.peek();
            }
            stt.push(i);
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        int max = -1;
        for(int i=0;i<n;i++){
            int area = (arr2[i]-arr1[i]-1)*heights[i];
            max = Math.max(max,area);
        }
        return max;
    }
}




// class Solution {
//     public int largestRectangleArea(int[] heights) {
//         int n= heights.length;
//         ArrayDeque<Integer> st = new ArrayDeque<>();
//         int[] ns = new int[n];
//         int[] ps = new int[n];

//         //next smaller
//         for(int i =n-1;i>=0;i--){
//             while(!st.isEmpty() && heights[st.peek()] >= heights[i]){
//                 st.pop();
//             }
//             if(st.isEmpty()){
//                 ns[i] = n;
//             }else{
//                 ns[i] = st.peek();
//             }
//             st.push(i);
//         }

//         ArrayDeque<Integer> st2 = new ArrayDeque<>();
//         //previous smaller
//         for(int i =0;i<n;i++){
//             while(!st2.isEmpty() && heights[st2.peek()] >= heights[i]){
//                 st2.pop();
//             }
//             if(st2.isEmpty()){
//                 ns[i] = -1;
//             }else{
//                 ns[i] = st2.peek();
//             }
//             st2.push(i);
//         }

//         int max = -1;
//         for(int i=0;i<n;i++){
//             int area = (ns[i]-ps[i]-1)*heights[i];
//             max = Math.max(max,area);
//         }
//         return max;
//     }
// }