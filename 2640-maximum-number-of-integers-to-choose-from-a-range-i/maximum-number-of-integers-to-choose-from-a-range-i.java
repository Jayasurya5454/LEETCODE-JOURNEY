class Solution {
    public int maxCount(int[] banned, int n, int Sum) {
        Set<Integer> st = new HashSet<>();
       for(int i : banned)
       {
            st.add(i);
       }
        int c =0,sum=0;

        for(int i = 1;i<=n;i++)
        {
            if(!st.contains(i)&&(sum+i<=Sum))
            {
                c++;
                sum+=i;

            }
        }
        return c;
        
    }
}