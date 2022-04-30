class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> arr = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(arr, new ArrayList<>(), candidates, target, 0);
        
        return arr;
    }
    
    public void backtrack(List<List<Integer>> arr, List<Integer> temp, int[] nums, int remain, int stIndex){
        if(remain < 0){
            return;
        }else if(remain == 0){
            arr.add(new ArrayList<>(temp));
        }else{
            for(int i=stIndex; i<nums.length; i++){
                if(i > stIndex && nums[i] == nums[i-1]) 
                    continue;
                temp.add(nums[i]);
                backtrack(arr, temp, nums, remain-nums[i], i+1);
                temp.remove(temp.size() - 1);   
            }
        }
    }
}