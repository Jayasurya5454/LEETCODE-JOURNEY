class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int count=0;
        int i= 0,j=nums.length-1;
        while(i<j)
        {
            if(nums[i]+nums[j]==k)
            {
                count++;
                j--;
                i++;
            }
            else if(nums[i]+nums[j]>k)
            {
                j--;
            }
            else
            {
                i++;
            }
        }
        return count;
        
    }
}