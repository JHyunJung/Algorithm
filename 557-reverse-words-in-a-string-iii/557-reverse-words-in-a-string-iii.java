class Solution {
    public String reverseWords(String s) {
        String[] splitedS = s.split(" ");
        String result = "";
        for(String sentence : splitedS){
            
            StringBuilder ns = new StringBuilder(sentence);
            ns.reverse();
            result += ns + " ";
        }
        
        return result.trim();
    }
}