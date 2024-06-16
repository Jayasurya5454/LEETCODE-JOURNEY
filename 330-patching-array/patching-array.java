class Solution {
    public int minPatches(int[] nums, int n) {
        int i = 0;
        long newAdd = 1;
        int count = 0;  

        while (newAdd <= n) 
        {

            if (i < nums.length && nums[i] <= newAdd) {
                newAdd += nums[i];
                i++;

            } 
            else
            {
                newAdd += newAdd;
                count++;
            }
        }
        return count;
    }
}
