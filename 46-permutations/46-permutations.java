class Solution {
    
    
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> arr = new ArrayList<>();
        
        
        backtrack(arr, new ArrayList<>(), nums);
            
        return arr;
    }
    
    public void backtrack(List<List<Integer>> arr, List<Integer> temp, int[] nums){
        if(temp.size() == nums.length)
        {   
            arr.add(new ArrayList<Integer>(temp));
        }else{
        for(int i=0; i<nums.length; i++){
            if(temp.contains(nums[i]))
                continue;
            temp.add(nums[i]);
            backtrack(arr, temp, nums);
            temp.remove(temp.size() -1);
        }
        }
        
    } 
}