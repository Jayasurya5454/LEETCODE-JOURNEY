class Solution {
    public int[] asteroidCollision(int[] ast) {
        
        Stack<Integer> st = new Stack <>();
        for(int i =0;i<ast.length;i++)
        {
            if(ast[i]>0)st.push(ast[i]);
            else
            {
                while(!st.empty()&&st.peek()>0&& Math.abs(ast[i])> st.peek()) st.pop();

                if (st.isEmpty() || st.peek() < 0) st.push(ast[i]);
            
                else if (st.peek() == Math.abs(ast[i])) st.pop();
                
            }
        }
        int res[]= new int[st.size()];
        for(int i =res.length-1;i>=0;i--)
        {
            res[i]=st.pop();
        }

        return res;

    }
}