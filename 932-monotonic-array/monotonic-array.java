class Solution {
    public boolean isMonotonic(int[] nums) {
        int n=nums.length-1;
        boolean high=true;
        boolean low=true;
        for(int i=0;i<n;i++){
            if(nums[i]>nums[i+1])
                high=false;
            if(nums[i]<nums[i+1])
                low=false;
        }
        return (low||high);
    }
}