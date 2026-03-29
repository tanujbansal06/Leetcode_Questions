class LeetCode_1295 {
    public int findNumbers(int[] nums) {
        int eveCnt = 0;
        for(int dig:nums){
            int c =0;
            while(dig>0){
                c++;
                dig=dig/10;
            }
            if(c%2==0){
                eveCnt++;
            }
        }
        return eveCnt;
    }
}