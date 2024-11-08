class Solution {
    public void moveZeroes(int[] nums) {
        int c=0;
        for(int i =0;i<nums.length;i++)
        { if(nums[i]==0)
            c++;
        }
        int i=0;
        for(int j=0;j<nums.length;j++)
        {   if(nums[j]!=0)
            nums[i++]=nums[j];
        }
        for(i=i;i<nums.length;i++)
        {
            nums[i]=0;
        }
        

    }
}