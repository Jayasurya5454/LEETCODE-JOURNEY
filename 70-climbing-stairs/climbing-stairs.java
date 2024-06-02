class Solution {
    public int climbStairs(int n) {
        if(n==0)return 0;
        int a =0,b=1,i=1,c=0;
        while(i<=n)
        {
             c =a+b;
            a=b;
            b=c;
            i++;
        }
        return c;

        
    }
}