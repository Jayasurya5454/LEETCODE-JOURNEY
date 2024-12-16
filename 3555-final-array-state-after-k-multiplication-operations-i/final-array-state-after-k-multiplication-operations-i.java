class Solution {
    public int[] getFinalState(int[] nums, int k, int mul) {
        int arr[] = new int[2];
       for(int i =0;i<k;i++)
       {
           arr= minimum_value(nums);
           nums[arr[1]]=arr[0]*mul;
       }
       return nums;
    }
    int[] minimum_value(int[] nums)
    {   int index =0;
        int min=Integer.MAX_VALUE;
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<min)
            {
                min = nums[i];
                index =i;
            }
        }
        return new int[] {min,index};
    }
}