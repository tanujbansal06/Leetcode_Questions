class LeetCode_287 {
    public int findDuplicate(int[] nums) {
        // int[] arr = nums.clone();
        // Arrays.sort(arr);
        // int n = nums.length;

        // for(int i=0;i<n;i++){
        //     if(arr[i]==arr[i+1]){
        //         return arr[i];
        //     }
        // }
        // return 0;

        // int n = nums.length;
        // int[] arr=new int[n];
        // for(int i=0;i<n;i++){
        //     if(arr[nums[i]]==0){
        //         arr[nums[i]] =1;
        //     }else{
        //         return nums[i];
        //     }
        // }
        // return 0;

        int fast = nums[0];
        int slow = nums[0];
        while(true){
            slow = nums[slow];
            fast = nums[nums[fast]];
            if(slow==fast) break;
        }

        slow = nums[0];
        while(slow!=fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return fast;



    }
}