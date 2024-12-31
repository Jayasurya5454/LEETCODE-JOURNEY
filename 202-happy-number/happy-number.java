class Solution {
    public boolean isHappy(int n) {
        
        do
        {  n = sep(n);

        }while(n!=1 &&n!=4);
        if(n==1)return true;
        return false;
        
        
    }
    int sep(int n)
    {   int s,k=0;
        while(n!=0)
        {
            s = n%10;
            k+=(s*s);
            n=n/10;
        }
        return k;
    }
    
}