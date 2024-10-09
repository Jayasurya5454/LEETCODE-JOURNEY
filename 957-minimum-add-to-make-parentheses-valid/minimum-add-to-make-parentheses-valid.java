class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stk = new Stack<>();
        int count=0;
        for(int i =0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(c=='(')
            {
                stk.push(c);
            }
            else
            {
                if(stk.empty())count++;
                else
                {
                    stk.pop();
                }
            }

        }
        return count+ stk.size();
        
    }
}