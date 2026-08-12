class LeetCode_34 {
    public int[] searchRange(int[] nums, int target) {
        // int s=-1;
        // int e = -1;
        // for(int i =0;i<nums.length;i++){
        //     if(nums[i]==target){
        //         if(s==-1){
        //             s=i;
        //         }
        //         e=i;
        //     }
        // }
        // return new int[]{s,e};
        int first = fele(nums,target);
        int last = lele(nums,target);
        return new int[] {first,last};
    }

    static int fele(int[] nums,int target){
            int start = 0;
            int end = nums.length-1;
            int fi = -1;
            while(start<=end){
                int mid = start+(end-start)/2;
                    if(nums[mid]==target){
                    fi = mid;
                    end = mid-1;
                }
                else if(target>nums[mid]){
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }
             }
             return fi;
        }

        static int lele(int[] nums,int target){
            int s = 0;
            int e = nums.length-1;
            int li =-1;

            while(s<=e){
                int m = s+(e-s)/2;
                if(nums[m]==target){
                    li = m;
                    s = m+1;
                }
                else if(target>nums[m]){
                    s = m+1;
                }
                else{
                    e = m-1;
                }
            }
            return li;
        }
}