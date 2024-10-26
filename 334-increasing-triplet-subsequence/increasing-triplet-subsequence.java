class Solution {
    public boolean increasingTriplet(int[] nums) {
        int f =2147483647;
        int s = 2147483647;
        for(int num : nums)
        {
            if(num<=f)f=num;
            else if (num<=s) s=num;
            else return true;

        }
        return false;
        
    }
}