class LeetCode_1886 {
    public boolean findRotation(int[][] mat, int[][] target) {
        for(int i =0;i<4;i++){
            if(checkEquals(mat,target)){
                return true;
            }
            mat = rotate(mat);
        }
        return false;
    }

    public boolean checkEquals(int[][] a,int[][] b){
        int n = a.length;
        for(int i =0;i<n;i++){
            for(int j =0;j<n;j++){
                if(a[i][j]!=b[i][j]){
                    return false;
                }
            }
        }
        return true;
    }

    public int[][] rotate(int[][] mat){
        int n = mat.length;
        int[][] ans = new int[n][n];
        for(int i =0;i<n;i++){
            for(int j =0;j<n;j++){
                ans[j][n-1-i] = mat[i][j];
            }
        }
        return ans;
    }  
}