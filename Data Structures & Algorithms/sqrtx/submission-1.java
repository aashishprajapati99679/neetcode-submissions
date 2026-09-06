class Solution {
    public int mySqrt(int x) {
       if (x == 0) return 0;
       int start = 1;
       int end = x;
       while(start <= end){
        int mid = start + (end - start)/2;
        long rot = (long)mid*mid; 
        if(rot == x){
            return mid;
        }else if(rot > x){
            end = mid - 1;
        }else{
            start = mid + 1;
        }
       } 
       return end;
    }
}