class Solution {
    public boolean hasAlternatingBits(int n) {
        int val = n^(n>>1);
        return (val&(val+1))==0;
        
    }
}