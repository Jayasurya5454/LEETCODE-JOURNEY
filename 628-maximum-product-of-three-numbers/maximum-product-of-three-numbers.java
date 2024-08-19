class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int mul1 = nums[0]*nums[1]*nums[n-1];
        int mul2 = nums[n-1]*nums[n-2]*nums[n-3];
        if(mul1>mul2)
        {
            return mul1;
        } 
        else
        {
        return mul2;  
        }    
    }
}