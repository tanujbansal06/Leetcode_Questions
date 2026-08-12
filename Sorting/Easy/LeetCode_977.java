class LeetCode_977 {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int left = 0;
        int right = n-1;
        int idx= n-1;
        while(left<=right){
            int ls = nums[left]*nums[left];
            int rs = nums[right]*nums[right];
            if(ls>rs){
                res[idx--]=ls;
                left++;
            }else{
                res[idx--] = rs;
                right--;
            }
        }
        return res;
    }
}