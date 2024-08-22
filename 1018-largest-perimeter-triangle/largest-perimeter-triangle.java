class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int max=0;
        for(int i = nums.length -3;i>=0;i--)
        {
            if((nums[i]+nums[i+1])>nums[i+2])
            {
                if(max<(nums[i]+nums[i+1]+nums[i+2]))
                {
                    max=nums[i]+nums[i+1]+nums[i+2];
                }
            }
        }
        return max;
    }
}