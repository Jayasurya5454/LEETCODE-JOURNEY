class Solution {
    public int maxArea(int[] h) {
        int n =h.length;
        int maxval=0;
        for(int i =0,j=n-1;i<j;)
        {
            int val = Math.min(h[i],h[j])*(j-i);
            if(h[i]>h[j])j--;
            else i++;
            maxval =Math.max(val,maxval);
        }
        return maxval;
        
    }
}