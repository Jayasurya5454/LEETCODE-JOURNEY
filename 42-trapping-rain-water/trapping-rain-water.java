class Solution {
    public int trap(int[] h) {
        int n = h.length;
        if(n ==1)return 0;
        int larr[]=new int[n];
        int rarr[]=new int[n];
        larr[0]=h[0];
        rarr[n-1]=h[n-1];
        for(int i=1;i<n;i++)
        {
            larr[i]=Math.max(h[i],larr[i-1]);
        }
        for(int i =n-2;i>=0;i--)
        {
            rarr[i]=Math.max(h[i],rarr[i+1]);

        }
        int sum =0;
        for(int i =0;i<n;i++)
        {
           sum+= Math.min(larr[i],rarr[i])-h[i];
        }
        return sum;
     
}
}