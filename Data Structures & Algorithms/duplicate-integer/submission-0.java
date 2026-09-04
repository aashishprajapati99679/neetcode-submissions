class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean result = false;
        for(int i = 0; i < nums.length-1; i++){
            int temp = nums[i];
            for(int j = i+1; j < nums.length; j++){
                if(temp == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
}