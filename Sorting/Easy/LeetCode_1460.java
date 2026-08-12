class LeetCode_1460 {
    public boolean canBeEqual(int[] target, int[] arr) {
        // HashMap<Integer,Integer> map = new HashMap<>();
        // for(int ele:arr){
        //     map.put(ele, map.getOrDefault(ele,0)+1);
        // }
        // for(int i:target){
        //     if(!map.containsKey(i) || map.get(i)==0) return false;
        //     map.put(i, map.get(i) - 1);
        // }
        // return true;

        int[] freq = new int[1001];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
            freq[target[i]]--;
        }

        for(int f:freq){
            if(f!=0) return false;
        }
        return true;
    }
}