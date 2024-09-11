class Solution {
    public int minBitFlips(int start, int goal) {
        String str = Integer.toBinaryString(start^goal);
        int c=0;
        for(char s : str.toCharArray())
        {
            if(s=='1')c++;
        }
        return c;
    }
}