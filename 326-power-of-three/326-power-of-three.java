class Solution {
    public boolean isPowerOfThree(int n) {
         if(n == 0)
            return false;
        
        int remain = 0;
        
        while(n != 1){
            remain = n%3;
            
            if(remain != 0)
                return false;
            
            n /= 3;
        }
        
        
        return true;
    }
}