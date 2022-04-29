class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> arr = new ArrayList<>();   
        backtrack(arr, new ArrayList<>(), nums, 0);
        return arr;
    }
    
    public void backtrack(List<List<Integer>> arr, List<Integer> temp, int[] nums, int step){
        arr.add(new ArrayList<>(temp));
        for(int i=step; i<nums.length; i++){
            temp.add(nums[i]);
            backtrack(arr, temp, nums, i + 1);
            temp.remove(temp.size() - 1);
        }
    }
}