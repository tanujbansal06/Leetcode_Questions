class LeetCode_1217 {
    public int minCostToMoveChips(int[] position) {
        int even =0;
        int odd =0;
        for(int i:position){
            if(i%2==0) even++;
            else odd++;
        }
        int ans = Math.min(even,odd);
        return ans;
    }
}