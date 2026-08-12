class LeetCode_198 {
    public int rob(int[] nums) {
        int n = nums.length;
        // int evemoney=0;
        // int oddmoney =0;
        // for(int i=0;i<n;i++){
        //     if(i%2==0){
        //         evemoney += nums[i];
        //     }else if(i%2!=0){
        //         oddmoney += nums[i];
        //     }
        // }
        // int m = Math.max(evemoney,oddmoney);
        // return m;

        int pre1 = nums[0];
        int pre2 =0;
        for(int i=1;i<n;i++){
            int curr = Math.max(pre1,pre2+nums[i]);
            pre2 = pre1;
            pre1 = curr;
        }
        return pre1;
    }
}