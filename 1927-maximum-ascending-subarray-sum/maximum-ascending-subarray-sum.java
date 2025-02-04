class Solution {
    public int maxAscendingSum(int[] nums) {
        int flag =nums[0];
        int max =0;
        
        for(int i =1;i<nums.length;i++)
        {
            if(nums[i]>nums[i-1])  flag+=nums[i];
            else
            {
                max = Math.max(max, flag);
                flag =nums[i];
            }
            
        }
        max = Math.max(max, flag);
        return max;
    }
}