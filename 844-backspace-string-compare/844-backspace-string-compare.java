class Solution {
    public boolean backspaceCompare(String s, String t) {
        if(s.length() == 0 || s == null || t.length() == 0 || t == null)
            return false;
        
        s = backspace(s);
        System.out.println(s);
        t = backspace(t);
        System.out.println(t);
        
        return s.equals(t);
    }
    
    public String backspace(String str){
        String nStr = "";
        int idx = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == '#'){
                if(idx > 0){
                    idx--;
                    nStr = nStr.substring(0,idx);
                }
            }else{
                idx++;
                nStr += Character.toString(str.charAt(i));
            }
                
        }
        return nStr;
    }
}