class Solution {
    public int maxScore(String s) {
        int totalones=0;
        for( var i : s.toCharArray()) if(i=='1')totalones++;
        int zeros=0;
        int ones=0;
        int best= Integer.MIN_VALUE;
        for(int i =0;i<s.length()-1;i++)
        {
            if(s.charAt(i)=='0')zeros++;
            else ones++;
            int count = zeros+(totalones-ones);
            best = Math.max(best, count);
        }
        return best;



        
    }
}