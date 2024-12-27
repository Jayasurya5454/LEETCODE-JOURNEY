class Solution {
    public int maxSubArray(int[] nums) {
        int ms =nums[0] , cs=0 ;
        for(int i =0;i<nums.length;i++)
        {
            if(cs<0)cs =0;
            cs=cs+nums[i];
            if(ms<cs)
            ms=cs;
        }
        return ms;
        
    }
}