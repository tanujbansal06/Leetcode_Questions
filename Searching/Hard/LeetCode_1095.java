
/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class LeetCode_1095 {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n = mountainArr.length();
        int low =0;
        int high = n-1;
        while(low<high){
            int mid = low+(high-low)/2;
            if(mountainArr.get(mid)<mountainArr.get(mid+1)){
                low = mid+1;
            }else{
                high = mid;
            }
        } 
        int peak = low;
        int left = bns(mountainArr,0,peak,target);
        int right = bns2(mountainArr,peak+1,n-1,target);
        if(left!=-1) return left;
        return right;
        
    }

    public int bns(MountainArray arr,int left,int right,int t){
        while(left<=right){
            int mid = left+(right-left)/2;
            if(arr.get(mid)==t){
                return mid;
            }else if(arr.get(mid)>t){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return -1;
    }

    public int bns2(MountainArray arr,int left,int right,int t){
        while(left<=right){
            int mid = left+(right-left)/2;
            if(arr.get(mid)==t){
                return mid;
            }else if(arr.get(mid)<t){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return -1;
    }
}