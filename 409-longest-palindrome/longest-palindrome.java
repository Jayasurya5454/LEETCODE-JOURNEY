class Solution {
    public int longestPalindrome(String s) {
        int len =0;
        Set <Character> sets = new HashSet();
        for( char c : s.toCharArray())
        {
            if(sets.contains(c))
            {
                len+=2;
                sets.remove(c);
            }
            else
            {
                sets.add(c);
            }
        }
        return sets.size()>0? len+1 : len;
        
        
        
    }
}