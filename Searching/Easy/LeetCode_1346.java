import java.util.*;
class LeetCode_1346 {
    public boolean checkIfExist(int[] arr) {
        // for(int i=0;i<arr.length;i++){
        //     for(int j =0;j<arr.length;j++){
        //         if((i!=j) && (arr[i]==2*arr[j])){
        //             return true;
        //         }
        //     }
        // }
        // return false;

        HashSet<Integer> set = new HashSet<>();
        for(int ele:arr){
            if(set.contains(ele*2) || ( (ele%2==0) && (set.contains(ele / 2)))) return true;
            set.add(ele);
        }
        return false;
    }
}