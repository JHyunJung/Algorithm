class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        
        List<List<Integer>> arr = new ArrayList<>();
        Arrays.sort(nums);
        
        backtrack(arr, new ArrayList<>(), nums, 0);
        
        return arr;
    }
    
    public void backtrack(List<List<Integer>> arr, List<Integer> temp, int[] nums, int stIndex){
        arr.add(new ArrayList<>(temp));
        
        for(int i=stIndex; i<nums.length; i++){
            if(i > stIndex && nums[i] == nums[i-1]) continue;
            temp.add(nums[i]);
            backtrack(arr, temp, nums, i+1);
            temp.remove(temp.size()-1);
        }
    }
}