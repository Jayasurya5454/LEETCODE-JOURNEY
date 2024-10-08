class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)return false;
        else
        {   String s = Integer.toString(x);
            for(int i=0,j=s.length()-1;i<s.length()/2;i++,j--)
            {
                if(s.charAt(i)!=s.charAt(j))return false;
            }
        }
        return true;
        
    }
}