class Solution {
    public boolean search(int[] nums, int target) {
        for(int i =0,j=nums.length-1;i<=j;i++,j--)
        {
            if(nums[i]==target)return true;
            if(nums[j]==target)return true;
            
            
        }
        return false;
        
    }
}