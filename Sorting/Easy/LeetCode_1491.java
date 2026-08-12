class LeetCode_1491 {
    public double average(int[] salary) {
        double ans = 0;
        int n = salary.length;
        // int ss=0;
        // Arrays.sort(salary);
        // for(int i:salary){
        //     ss += i;
        // }
        // ss = ss-salary[0]-salary[n-1];
        // return (double)(ss/(n-2));
        int sals =0;
        int mn=Integer.MAX_VALUE;
        int mx=Integer.MIN_VALUE;
        for(int sal:salary){
            sals += sal;
            mx = Math.max(sal,mx);
            mn = Math.min(mn,sal);
        }
        sals = sals-mn-mx;
        //return (double)(sals*1.0/(n-2));
        return (double)(sals) / ((double)(n-2));

    }
}