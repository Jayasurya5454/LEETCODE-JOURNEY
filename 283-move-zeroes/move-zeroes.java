class Solution {
    public void moveZeroes(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();

        int k = nums.length;
        int zero =0;
        for(int i =0;i<k;i++)
        {
            if(nums[i]!=0)
            {
                list.add(nums[i]);
            }
            else
            {
                zero++;
            }
        }
        for(int i =0;i<zero;i++)
        {
            list.add(0);
        }
        for(int i =0;i<k;i++)
        {
            nums[i]=list.get(i);
            System.out.println(nums[i]);
        }

        
    }
}