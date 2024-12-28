class Solution {
    public int maximumGap(int[] nums) {
        int max = 0;
        Arrays.sort(nums);
        if(nums.length==1)return 0;
        if(nums.length==2)return Math.abs(nums[0]-nums[1]);
        for(int i =0;i<nums.length-1;i++)
        {   if(max<(nums[i+1]-nums[i]))
            max=nums[i+1]-nums[i];
        }
        return max;
        
    }
}