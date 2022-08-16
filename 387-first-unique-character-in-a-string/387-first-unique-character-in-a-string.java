class Solution {
    public int firstUniqChar(String s) {
         HashMap<String, Integer> m = new HashMap<>();
        String[] t = s.split("");
        int s_len = s.length();
        
        for(int i=0; i<s_len; i++){
            m.put(t[i], m.getOrDefault(t[i], 0) + 1);
        }
        
        for(int i=0; i<s_len; i++){
            
            if(m.get(t[i]) == 1)
                return i;
        }
        return -1;
    }
}