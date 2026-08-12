class LeetCode_1499 {
    public int findMaxValueOfEquation(int[][] points, int k) {
        // int ans = Integer.MIN_VALUE;
        // int n = points.length;
        // for(int j =0;j<n;j++){
        //     int xj = points[j][0];
        //     int yj = points[j][1];
        //     for(int i=0;i<j;i++){
        //         int xi=points[i][0];
        //         int yi = points[i][1];
        //         if(xj-xi<=k){
        //             int val = yi + yj + (xj - xi);
        //             ans = Math.max(val,ans);
        //         }
        //     }
        // }
        // return ans;

        // int n = points.length;
        // int ans = Integer.MIN_VALUE;
        // int left = 0;
        // for (int j = 0; j < n; j++) {
        //     int xj = points[j][0];
        //     int yj = points[j][1];
        //     while (left < j && xj - points[left][0] > k) {
        //         left++;
        //     }
        //     int best = Integer.MIN_VALUE; 
        //     for (int i = left; i < j; i++) {
        //         best = Math.max(best,
        //                 points[i][1] - points[i][0]);
        //     }
        //     if (best != Integer.MIN_VALUE) {
        //         ans = Math.max(ans, best + yj + xj);
        //     }
        // }
        // return ans;
         
        int n = points.length;
        int[] dq = new int[n];
        int front = 0, back = -1;
        int ans = Integer.MIN_VALUE;

        for (int j = 0; j < n; j++) {

            int xj = points[j][0];
            int yj = points[j][1];
            while (front <= back &&
                   xj - points[dq[front]][0] > k) {
                front++;
            }
            if (front <= back) {
                int i = dq[front];
                int val = (points[i][1] - points[i][0]) + xj + yj;
                ans = Math.max(ans, val);
            }
            while (front <= back &&
                   (points[dq[back]][1] - points[dq[back]][0])
                   <= (yj - xj)) {
                back--;
            }
            dq[++back] = j;
        }

        return ans;
    }
}

