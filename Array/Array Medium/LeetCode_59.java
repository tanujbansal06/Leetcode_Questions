class LeetCode_59 {
    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        int srow = 0;
        int scol =0;
        int erow=n-1;
        int ecol = n-1;
        int val =1;
        while(val<=n*n){
            for(int j = scol;j<=ecol;j++){
            ans[srow][j] = val;
            val++;
        }

        for(int i =srow+1; i<=erow;i++){
            ans[i][ecol] = val;
            val++;
        }

        for(int j =ecol-1;j>=scol;j--){
            ans[erow][j] = val;
            val++;
        }

        for(int i=erow-1;i>=srow+1;i--){
            ans[i][scol]=val;
            val++;
        }
        srow++;
        erow--;
        scol++;
        ecol--;
        }
        return ans;
    }
}