class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        
        backtrack(result, new ArrayList<>(), 1, k, n);
        
        return result;
    }
    
    public void backtrack(List<List<Integer>> result, List<Integer> temp, int stIndex, int k, int n){
        if(temp.size() == k){
            int sum = 0;
            for(int i=0; i<k; i++){
                sum += temp.get(i);
            }
            
            if(sum == n){
                result.add(new ArrayList<>(temp));
            }
        }
        else{
            for(int i=stIndex; i<10; i++){
                temp.add(i);
                backtrack(result, temp, i+1, k, n);
                temp.remove(temp.size()-1);
            }
        }
        
    }
}