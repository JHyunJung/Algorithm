class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> arr = new ArrayList<>();
        backtrack(arr, new ArrayList<>(), candidates, target, 0);
        return arr;   
    }
    
    public void backtrack(List<List<Integer>> arr, List<Integer> temp, int[] candidates, int remain, int stIndex){
        if(remain < 0) return;
        else if(remain == 0){
            arr.add(new ArrayList<>(temp));
        }else{
            for(int i=stIndex; i<candidates.length; i++){
                temp.add(candidates[i]);
                backtrack(arr, temp, candidates, remain-candidates[i], i);
                temp.remove(temp.size()-1);
            }
        }
    }
}