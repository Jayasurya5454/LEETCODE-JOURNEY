class Solution {
    public int[] countBits(int n) {
        int arr[]= new int[n+1];
        for(int i=0;i<=n;i++)
        {   if (i==0)arr[i] =0;
            if(i>0 && (i&(i-1)) == 0) arr[i]=1;
            else
            {
                arr[i]=arr[i >> 1] + (i & 1);
            }
            
            
            
        }
     return arr;   
    }
}