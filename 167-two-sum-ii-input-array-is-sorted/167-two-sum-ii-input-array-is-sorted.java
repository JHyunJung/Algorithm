class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> h = new HashMap<>();
        h.put(numbers[0], 1);
        for(int i=1; i<numbers.length; i++){
            int remain = target - numbers[i];
            if(h.containsKey(remain)){
                result[0] = h.get(remain);
                result[1] = i+1;
                break;
            }
            h.put(numbers[i], i+1);
        }
        return result;
    }
}