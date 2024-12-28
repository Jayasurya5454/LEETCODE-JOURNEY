class Solution {
    public int findMin(int[] nums) {
        for(int i =0,j=i+1;j<nums.length;i++,j++)
        {
            if(nums[j]<nums[i])
            {
                return nums[j];
            }
        }
        return nums[0];
        
    }
}