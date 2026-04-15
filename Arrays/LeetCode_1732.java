class LeetCode_1732 {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int[] arr = new int[n];
        int maxx=0;
        //arr[0] = 0;
        int currsum = 0;
        for(int i =0;i<n;i++){
            currsum += gain[i];
            arr[i] = currsum;
            maxx = Math.max(currsum,maxx);
        }
        if(maxx<0) return 0;
        else return maxx;

    }
}