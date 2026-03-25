class LeetCode_832 {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        for(int[] i :image){
            int left =0;
            int right = n-1;
            while(left<right){
                int temp = i[left];
                i[left] = i[right];
                i[right] = temp;
                left++;
                right--;
            }
        }

        for(int[] i:image){
            for(int j =0;j<n;j++){
                if(i[j]==0){
                    i[j] =1;
                }else if(i[j]==1){
                    i[j] =0;
                }
            }
        }
        return image;
    }
}