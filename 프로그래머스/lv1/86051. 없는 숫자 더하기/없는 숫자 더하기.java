import java.util.List;
import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 45;
        
        for(Integer num : numbers){
            answer -= num;
        }
        
        return answer;
    }
}