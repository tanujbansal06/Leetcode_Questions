class LeetCode_1051 {
    public int heightChecker(int[] heights) {
        // int[] expected = heights.clone();
        // Arrays.sort(expected);
        // int c=0;
        // for(int i=0;i<heights.length;i++){
        //     if(heights[i]!=expected[i]) c++;
        // }
        // return c;

        int[] count = new int[101];
        for(int h: heights){
            count[h]++;
        }
        int idx=0;
        int ans=0;
        for(int i=1;i<101;i++){
            while(count[i]>0){
                if(heights[idx]!=i){
                    ans++;
                }
                count[i]--;
                idx++;
            }
        }
        return ans;
    }

}