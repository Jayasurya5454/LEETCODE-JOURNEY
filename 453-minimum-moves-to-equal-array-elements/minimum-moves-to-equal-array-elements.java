class Solution {
    public int minMoves(int[] nums) {
        int min = nums[0], sum = nums[0];
        for(int i=1; i < nums.length; i++){
            min = Math.min(min, nums[i]);
            sum += nums[i];
        }
        return sum-min*nums.length;
    }
}