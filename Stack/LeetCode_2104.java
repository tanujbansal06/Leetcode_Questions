import java.util.ArrayDeque;

public class LeetCode_2104 {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(subArrayRanges(nums));
    }   

    public static long subArrayRanges(int[] nums) {
        int n = nums.length;
        int[] ng = new int[n];
        int[] pg = new int[n];
        int[] ps = new int[n];
        int[] ns = new int[n];
        ArrayDeque<Integer> st = new ArrayDeque<>();
        
        //pg
        for(int i =0;i<n;i++){
            while(!st.isEmpty() && nums[i] > nums[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                pg[i] = -1;
            }else{
                pg[i] = st.peek();
            }
            st.push(i);
        }

        st.clear();
        
        //ng
        for(int i =n-1;i>=0;i--){
            while(!st.isEmpty() && nums[i] >= nums[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                ng[i] = n;
            }else{
                ng[i] = st.peek();
            }
            st.push(i);
        }

        st.clear();
        //ps
        for(int i =0;i<n;i++){
            while(!st.isEmpty() && nums[i] < nums[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                ps[i] = -1;
            }else{
                ps[i] = st.peek();
            }
            st.push(i);
        }

        st.clear();
        
        //ns
        for(int i =n-1;i>=0;i--){
            while(!st.isEmpty() && nums[i] <= nums[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                ns[i] = n;
            }else{
                ns[i] = st.peek();
            }
            st.push(i);
        }

        long mins = 0;
        long maxs =0;
        for(int i =0;i<n;i++){
            long r = ns[i]-i;
            long l = i-ps[i];
            mins += l*r*nums[i];
        }
        for(int i =0;i<n;i++){
            long l = i-pg[i];
            long r = ng[i] - i;
            maxs += l*r*nums[i];
        }
        return maxs-mins;
    }
}
