class Solution {
    public char findTheDifference(String s, String t) {
        int s1=0;
        int s2=0;
        for(char S : s.toCharArray())
        {
            s1+= (int)S;
        }
        for(char S : t.toCharArray())
        {
            s2+= (int)S;
        }
        int diff = s2-s1;
        return (char)diff;
        
    }
}