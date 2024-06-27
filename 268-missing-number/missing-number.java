class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        if(nums[0]==1)
        return 0;
        for( int i=0;i<nums.length-1;i++)
        {
            int k = nums[i+1]-nums[i];
            if(k==2)
            {
                return nums[i]+1;
            }
        }
        return nums[nums.length-1]+1;
        
    }
}