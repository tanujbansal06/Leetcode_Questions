class LeetCode_1608 {
    public int specialArray(int[] nums) {
        for(int x=0;x<=nums.length;x++){
            int c=0;
            for(int ele:nums){
                if(ele>=x) c++;
            }
            if(c==x) return x;

        }
        return -1;

    }
}