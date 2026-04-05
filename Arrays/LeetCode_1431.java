import java.util.*;
class LeetCode_1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        int maxcandies = 1;
        for(int i: candies){
            maxcandies = Math.max(i,maxcandies); 
        }
        List<Boolean> result = new ArrayList<>(n);
        for(int i =0;i<n;i++){
            int currcandies = candies[i] + extraCandies;
            if(currcandies>=maxcandies){
                result.add(i,true);
            }else{
                result.add(i,false);
            }
        }
        return result;
    }
}