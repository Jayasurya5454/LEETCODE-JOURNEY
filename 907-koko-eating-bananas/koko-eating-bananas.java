class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max =0;
        for(int i =0;i<piles.length;i++)
        {
            max = Math.max(max,piles[i]);
        }
        int l = 1;
        int r = max;
        while(l<=r)
        {
            int mid = (l+r)/2;
            int div =0;
            for(int j =0;j<piles.length;j++)
            {
                div +=Math.ceil((double)piles[j]/mid); 
            }
            if(div>h)l=mid+1;
            else r = mid-1;
        }
        return l;


        
       
        
    }
}