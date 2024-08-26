class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        LinkedList<Integer> le = new LinkedList<>();
        LinkedList<Integer> lo = new LinkedList<>();

        for(int i : nums)
        {
            if(i%2!=0)
            {
                lo.add(i);
            }
            else
            {
                le.add(i);
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            if(i%2==0)
            {
                nums[i]=le.removeFirst();
            }
            else
            {
                nums[i]=lo.removeFirst();
            }
        }
        return nums;
        
    }
}