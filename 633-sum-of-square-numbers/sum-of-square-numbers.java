class Solution {
    public boolean judgeSquareSum(int c) {
        for(long i =0;i*i<=c;i++)
        {
            double j  = Math.sqrt(c-i*i);
            if((int)j == j)
            {
                return true;
            }
        }
        return false ;
        
    }
}