class LeetCode_1464{
    public int maxProduct(int[] nums) {
        // int val =Integer.MIN_VALUE;
        // for(int i = 0;i<nums.length;i++){
        //     for(int j=0;j<nums.length;j++){
        //         if(i!=j){
        //             int mu = (nums[i]-1)*(nums[j]-1);
        //             val = Math.max(val,mu);
        //         }
        //     }
        // }
        // return val;

        // Arrays.sort(nums);
        // return (nums[nums.length-1]-1) * (nums[nums.length-2]-1);

        int m1 =0;
        int m2 =0;
        for(int i:nums){
            if(i>m1){
                m2=m1;
                m1=i;
            }else if(i>m2){
                m2=i;
            }
        }
        return (m1-1) * (m2-1);

    }
}