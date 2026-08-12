class LeetCode_1351 {
    public int countNegatives(int[][] grid) {
        // int count =0;
        // for(int i=0;i<grid.length;i++){
        //     for(int j=0;j<grid[0].length;j++){
        //         if(grid[i][j] <0) count++;
        //     }
        // }
        // return count;
        int m = grid.length;
        int n = grid[0].length;
        int row = 0;
        int col = n-1;
        int count =0;
        while(row<m && col>=0){
            if(grid[row][col]<0){
                count +=(m-row);
                col--;
            }else{
                row++;
            }
        }
        return count;

    }
}