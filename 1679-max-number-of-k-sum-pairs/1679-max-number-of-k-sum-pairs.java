class Solution {
    public int maxOperations(int[] nums, int k) {
        int answer = 0;
        
        Map<Integer, Integer> h = new HashMap<>();
        
        for(Integer num : nums){
            h.put(num, h.getOrDefault(num, 0)+1);
        }
        
        for(Integer num : nums){
            if(h.containsKey(k-num)){
                
                if(k-num == num){
                    if(h.get(num) > 1){
                        h.put(num, h.getOrDefault(num, 0)-2);
                        answer++;
                    }
                }else{
                    if(h.get(k-num) > 0 && h.get(num) > 0){
                        h.put(num, h.getOrDefault(num, 0)-1);
                        h.put(k-num, h.getOrDefault(k-num, 0)-1);
                        answer++;
                    }
                }
            }
        }
        
        
        return answer;
    }
}