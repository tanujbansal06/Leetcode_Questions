class LeetCode_1672{
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        //int curr = 0;
        for(int i =0;i<accounts.length;i++){
            int curr =0;
            for(int j =0;j<accounts[i].length;j++){
                curr += accounts[i][j];
            }
            maxWealth = Math.max(curr,maxWealth);
        }
        return maxWealth;
    }
}
