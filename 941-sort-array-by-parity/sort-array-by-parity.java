class Solution {
    public int[] sortArrayByParity(int[] nums) {
        Arrays.sort(nums);
        ArrayList <Integer> lst = new ArrayList<Integer>();
        for(int i =0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
            {
                lst.add(nums[i]);
            }
        }
        for(int i =0;i<nums.length;i++)
        {
            if(nums[i]%2!=0)
            {
                lst.add(nums[i]);
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=lst.get(i);
        }
        return nums;
    }
}