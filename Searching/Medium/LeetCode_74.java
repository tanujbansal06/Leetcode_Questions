
class LeetCode_74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        // for(int i=0;i<matrix.length;i++){
        //     for(int j=0;j<matrix[0].length;j++){
        //         if(matrix[i][j]==target) return true;
        //     }
        // }
        // return false;

        // int m = matrix.length;
        // int n = matrix[0].length;

        // int low = 0, high = m * n - 1;

        // while (low <= high) {
        //     int mid = low + (high - low) / 2;

        //     int row = mid / n;
        //     int col = mid % n;

        //     if (matrix[row][col] == target) return true;
        //     else if (matrix[row][col] < target) low = mid + 1;
        //     else high = mid - 1;
        // }
        // return false;

        for(int[] arr:matrix){
            if(target>=arr[0] && target<=arr[arr.length-1]){
                if(bns(0,arr.length-1,target,arr)) return true;
            }
        }
        return false;
    }

    public boolean bns(int low,int high, int k,int[] arr){
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]==k){
                return true;
            }else if(arr[mid]>k){
                high = mid-1;
            }else{
                low= mid+1;
            }
        }
        return false;
    }
}