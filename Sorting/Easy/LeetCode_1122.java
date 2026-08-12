
class LeetCode_1122 {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] count = new int[1001];
        for(int i:arr1){
            count[i]++;
        }
        int idx=0;
        for(int ele:arr2){
            while(count[ele]>0){
                arr1[idx]=ele;
                idx++;
                count[ele]--;
            }
        }
        
        for(int i=0;i<1001;i++){
            while(count[i]>0){
                arr1[idx] = i;
                idx++;
                count[i]--;
            }
        }
        return arr1;
    } 
}