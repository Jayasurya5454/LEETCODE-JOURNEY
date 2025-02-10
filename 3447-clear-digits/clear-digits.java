class Solution {
    public String clearDigits(String s) {
        Stack<Character> st = new Stack<>();
        for(char i : s.toCharArray())
        {
            if(Character.isDigit(i)&&!st.isEmpty())
            {
                st.pop();
            }
            else st.push(i);
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty())
        {
            sb.insert(0,st.pop());
        }
        return sb.toString();
    }
}