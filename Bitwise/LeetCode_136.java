class Solution {
    public int singleNumber(int[] nums) {
        int xor=0;
        for(int i =0;i<nums.length;i++){
            xor = xor ^ nums[i];
        }
        return xor;
    }
}
//a^a = 0 and a^0 = a --> means all the paired elements will get 0 and remaining single element having xor with 0 will give itself as answer
