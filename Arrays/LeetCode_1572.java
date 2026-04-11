class LeetCode_1572 {
    public int diagonalSum(int[][] mat) {
        // int left =0;
        // int right = mat.length-1;
        // int s = 0;
        // int n = mat.length;
        // int org = mat.length;
        // for(int[] i:mat){
        //     while(n>0){
        //         s += i[left] + i[right];
        //         left++;
        //         right--;
        //         n--;
        //     }
        // }
        // if(org%2==1){
        //     s -= mat[org/2][org/2];
        //     return s;
        // }else{
        //     return s;
        // }

        int sum =0;
        int n = mat.length;
        for(int i =0;i<n;i++){
            sum+= mat[i][i];
            sum += mat[i][n-1-i];
        }
        if(n%2==1){
            sum = sum-mat[n/2][n/2];
        }
        return sum;
    }
}