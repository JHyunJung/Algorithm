class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        int f = -1,l = -1;
        
        for(int i=0; i<nums.length; i++){
            if(nums[i] == target){
                if(f != -1){
                    l = i;
                }else{
                    f = i;
                    l = i;
                }
            }
        }
        
        result[0] = f;
        result[1] = l;
        return result;
        
    }
}