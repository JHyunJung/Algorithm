class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> arr = new ArrayList<>();
        
        backtrack(arr, new ArrayList<>(), s, 0);
        
        
        return arr;
    }
    
    public void backtrack(List<List<String>> arr, List<String> temp, String s, int stIndex){
         if(stIndex == s.length())
            arr.add(new ArrayList<>(temp));
        else{
            for(int i = stIndex; i < s.length(); i++){
                if(isPalindrome(s, stIndex, i)){
                    temp.add(s.substring(stIndex, i + 1));
                    backtrack(arr, temp, s, i + 1);
                    temp.remove(temp.size() - 1);
                }
            }
        }
    }
    
    public boolean isPalindrome(String s, int low, int high){
        while(low < high)
            if(s.charAt(low++) != s.charAt(high--)) return false;
        return true;
    } 
}