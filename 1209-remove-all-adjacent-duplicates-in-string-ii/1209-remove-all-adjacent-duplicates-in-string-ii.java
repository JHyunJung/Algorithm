class Solution {
    public String removeDuplicates(String s, int k) {
      if(s == ""|| s == null || k <= 0)
            return s;

        String answer = "";
        Stack<Character> st = new Stack<>();
        int count = 0;

        st.push(s.charAt(0));
        count++;

        for(int i=1; i<s.length(); i++){

                if(!st.isEmpty() && st.peek() == s.charAt(i)){
                    st.push(s.charAt(i));
                    count++;
                    if(count == k) {
                        while (true) {
                            st.pop();
                            count--;
                            if (count == 0)
                                break;
                        }
                        if (!st.isEmpty()) {
                            char temp = st.peek();
                            count = 0;
                            while (!st.isEmpty()) {
                                if(temp != st.peek())
                                    break;
                                st.pop();
                                count++;
                            }
                            for (int j = 0; j < count; j++) {
                                st.push(temp);
                            }
                        }
                    }
            }else{
                st.push(s.charAt(i));
                count = 1;
            }
        }

        for(int i=0; i<st.size(); i++){
            answer += Character.toString(st.get(i));
        }



        return answer;
    }
}