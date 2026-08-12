class LeetCode_1901{
    public int[] findPeakGrid(int[][] mat) {
        // int m = mat.length;
        // int mx=0;
        // int n = mat[0].length;
        // for(int i=0;i<m;i++){
        //     for(int j=0;j<n;j++){
        //         mx = Math.max(mx,mat[i][j]);
        //     }
        // }
        // int si=0;
        // int ei=0;
        // for(int i=0;i<m;i++){
        //     for(int j=0;j<n;j++){
        //         if(mat[i][j]==mx){
        //             si =i;
        //             ei =j;
        //         }
        //     }
        // }
        // return new int[] {si,ei};

        int m = mat.length;
        int n = mat[0].length;

        int low =0;
        int high = n-1;

        while(low<=high){
            int mid = low+(high-low)/2;
            int mx=Integer.MIN_VALUE;
            int index=0;
            for(int i=0;i<m;i++){
                if(mat[i][mid]>mx){
                    mx = mat[i][mid];
                    index=i;
                }
            }
            int left=-1;
            if(mid-1>=0){
                left = mat[index][mid-1];
            }
            int right = -1;
            if(mid+1<n){
                right = mat[index][mid+1];
            }

            if(mx>left && mx>right){
                return new int[] {index,mid};
            }

            if(left>mx){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return new int[] {-1,-1};

    }
}