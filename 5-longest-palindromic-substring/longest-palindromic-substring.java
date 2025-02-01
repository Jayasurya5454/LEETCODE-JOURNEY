class Solution {
    private String expand(int l ,int r, String s)
    {
        while(l>=0&&r<s.length()&&s.charAt(l)==s.charAt(r))
        {
            l--;
            r++;
        }
        return s.substring(l+1,r);
    }

    public String longestPalindrome(String s) {
        if(s.length()<=1)return s;
        String maxStr = s.substring(0,1);
        for(int i =0;i<s.length()-1;i++)
        {
            String odd = expand(i,i,s);
            String even = expand(i,i+1,s);
            if(odd.length()>maxStr.length())maxStr = odd;
            if(even.length()>maxStr.length())maxStr = even;
        }
        return maxStr;
        
    }
}