class LeetCode_1304{
    public int[] sumZero(int n) {
        int ans[] = new int[n];
        int idx =0;
        for(int i =1;i<=n/2;i++){
            ans[idx++] = i;
            ans[idx++] = -i;
        }
        if(n%2!=0){
            ans[idx] = 0;
        }
        return ans;
    }
}