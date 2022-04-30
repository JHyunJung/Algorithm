class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> arr = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(arr, new ArrayList<>(), nums, new boolean[nums.length]);
        return arr;
    }
    
    public void backtrack(List<List<Integer>> arr, List<Integer> temp, int[] nums, boolean[] used){
        if(temp.size() == nums.length){
            arr.add(new ArrayList<>(temp));
        }else{
            
            for(int i=0; i<nums.length; i++){
                if(used[i] || i > 0 && nums[i] == nums[i-1] && !used[i - 1]) continue;
                used[i] = true; 
                temp.add(nums[i]);
                backtrack(arr, temp, nums, used);
                used[i] = false; 
                temp.remove(temp.size() - 1);
            }
            
        }
            
    }
}