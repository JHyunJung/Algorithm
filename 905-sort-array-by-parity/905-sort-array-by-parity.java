class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] answer = new int[nums.length];
        int idx = 0;
        for(Integer num : nums){
            if(num%2==0)
                answer[idx++] = num;
        }
        
        for(Integer num : nums){
            if(num%2==1)
                answer[idx++] = num;
        }
        
        return answer;
    }
}