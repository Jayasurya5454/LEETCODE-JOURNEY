class Solution {
    public String baseNeg2(int n) {
        if (n==0) return "0";
        StringBuilder sb = new StringBuilder();
        while(n!=0)   
        {
            int s = n%-2;
            n=n/-2;
            if(s<0)
            {
                s+=2;
                n++;
            }
            sb.append(s);
        
        }
        return sb.reverse().toString();
        
}
}