import java.util.*;;
class LeetCode_448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> list = new ArrayList<>();
        // HashSet<Integer> set = new HashSet<>();
        // for(int ele:nums){
        //     set.add(ele);
        // }

        // for(int i=1;i<=n;i++){
        //     if(!set.contains(i)){
        //         list.add(i);
        //     }
        // }
        
        int[] arr = new int[nums.length+1];
        for(int num:nums){
            arr[num]++;
        }
        for(int i=1;i<=nums.length;i++){
            if(arr[i]==0){
                list.add(i);
            }
        }
        return list;

    }
}