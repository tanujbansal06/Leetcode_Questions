class LeetCode_441 {
    public int arrangeCoins(int n) {
        // int steps =0;
        // int req =1;
        // while(req<=n){
        //     n = n-req;
        //     steps++;
        //     req++;
        // }
        // return steps;
        int ans =0;
        long left =0;
        long right = n;
        while(left<=right){
            long mid = left+(right-left)/2;
            long cn = (mid*(mid+1))/2;
            if(cn<=n){
                ans =(int) mid;
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return ans;

    }
}