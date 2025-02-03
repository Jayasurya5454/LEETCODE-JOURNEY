class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int dec =1, inc =1,ans =0,temp=0;
        if(nums.length==1)return 1;
        for(int i=1 ;i<nums.length;i++)
        {
            if(nums[i-1]>nums[i]){
                dec++; inc=1;
            }
            else if (nums[i]>nums[i-1])
            {
                inc++; dec =1;
            }
            else 
            {
                dec=inc =1;
            }
            temp = Math.max(inc,dec);
            ans = Math.max(temp,ans);

        }
        return ans;
    }
}