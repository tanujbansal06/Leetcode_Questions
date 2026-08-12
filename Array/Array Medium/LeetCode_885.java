class LeetCode_885 {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] ans = new int[rows*cols][2];
        ans[0][0] = rStart;
        ans[0][1] = cStart;
        int[] dr ={0,1,0,-1};
        int[] dc = {1,0,-1,0};
        int idx=1;
        int step =1;
        int dir =0;
        while(idx<rows*cols){
            for(int k=0;k<2;k++){
                for(int i=0;i<step;i++){
                    rStart += dr[dir];
                    cStart += dc[dir];

                    if(rStart >=0 && rStart <rows && cStart>=0 && cStart<cols){
                        ans[idx][0] = rStart;
                        ans[idx][1] = cStart;
                        idx++;
                    }

                }
                dir = (dir+1)%4;
            }
            step++;
        }
        return ans;

    }
}