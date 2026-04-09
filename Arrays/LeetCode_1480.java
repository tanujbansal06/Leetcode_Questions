class LeetCode_1480 {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int currsum = 0;
        int[] runsum = new int[n];
        for(int i =0;i<n;i++){
            runsum[i] = currsum+nums[i];
            currsum += nums[i];
        }
        return runsum;
    }
}
