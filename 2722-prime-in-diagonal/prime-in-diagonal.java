class Solution {
    public int diagonalPrime(int[][] nums) {
        TreeSet<Integer> st=new TreeSet<>();
        for(int i=0;i<nums.length;i++)
        {
            if(isprime(nums[i][nums.length - i - 1]))
            st.add(nums[i][nums.length - i - 1]);
            if(isprime(nums[i][i]))
            {
                st.add(nums[i][i]);
            }
        }
        int p=st.size();
        if(p==0)return 0;
        return st.last();        
        
    }
    public boolean isprime(int n)
    {
        if(n<=1)return false;
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)return false;
        }
        return true;
    }
}