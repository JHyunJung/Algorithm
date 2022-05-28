class Solution {
    public int missingNumber(int[] nums) {
        int answer = 0;
        HashMap<Integer, Boolean> h = new HashMap<>();
        Arrays.sort(nums);
        
        for(int i=0; i<nums.length; i++){
            h.put(nums[i], true);
        }
        
        for(int i=0; i<=nums.length; i++){
            if(!h.containsKey(i)){
                return i;
            }
        }
        
        return answer;
    }
}