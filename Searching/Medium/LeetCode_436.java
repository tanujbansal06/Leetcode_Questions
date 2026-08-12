
class LeetCode_436 {
    public int[] findRightInterval(int[][] intervals) {
        int[] ans = new int[intervals.length];
        int n = intervals.length;
        for(int i=0;i<n;i++){
            int idx = -1;
            int minst = Integer.MAX_VALUE;
            for(int j=0;j<n;j++){
                if(intervals[j][0]>=intervals[i][1] && minst>intervals[j][0]){
                    idx=j;
                    minst=intervals[j][0];
                }
            }
            ans[i] = idx;
        }
        return ans;
    }
}