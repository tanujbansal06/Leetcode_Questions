public class LeetCode_268 {
    public static void main(String[] args) {
        int[] arr = {3,0,1};
        System.out.println(missingNumber(arr));
    }
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        // int sum = n*(n+1)/2;
        // int to= 0;
        // for(int ele:nums){
        //     to = to+ele;
        // }
        // return (sum-to);
        int xor =0;
        int x=0;
        for(int i =0;i<=n;i++){
            x ^= i;
        }
        for(int e:nums){
            xor ^= e;
        }
        return(x ^ xor);
    }
}
