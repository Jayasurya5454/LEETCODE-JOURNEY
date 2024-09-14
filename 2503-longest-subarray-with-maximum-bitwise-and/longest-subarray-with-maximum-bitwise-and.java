class Solution {
    public int longestSubarray(int[] nums) {
        int max=0,count =0,L=0;
        for(int i=0;i<nums.length;i++)
        {
            max = Math.max(nums[i],max);
        }
        for(int i =0;i<nums.length;i++)
        {
            if(max==nums[i])
            {
                count++;
                L= Math.max(L,count);
            }
            else count =0;
        }
        return L;
        
    }
}