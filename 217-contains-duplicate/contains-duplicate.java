class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0,j=1;j<nums.length;j++)
        {
            if(nums[i]==nums[j])
            {
                return true;
            }
            i++;
        }
        return false;
        
    }
}