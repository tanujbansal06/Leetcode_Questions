public class LeetCode_136 {
    public static void main(String[] args) {
        int[] nums = {1,1,3,4,2,2,3};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        int xor=0;
        for(int i =0;i<nums.length;i++){
            xor = xor ^ nums[i];
        }
        return xor;
    }
}

//a^a = 0 and a^0 = a --> means all the paired elements will get 0 and remaining single element 
//having xor with 0 will give itself as answer
