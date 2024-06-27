class Solution {
    public int[] getConcatenation(int[] nums) {
        int ans[]= new int[nums.length*2];
        int i;
        for(i =0;i<nums.length;i++)
        {
            ans[i]=nums[i];
        }
        int j=0;
        while(i<nums.length*2)
        {
            ans[i]=nums[j];
            i++;j++;
        }
        return ans;

        
    }
}