class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> res = new HashSet<>();
        if(nums == null || nums.length<3)
        {
            return new ArrayList<>();
        }
        for(int i =0;i<nums.length-2;i++)
        {
            int l=i+1;
             int r = nums.length-1;
            while(l<r)
            {
                if(nums[i]+nums[l]+nums[r]==0)
                {
                    res.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    l++;
                    r--;
                }
                else if((nums[i]+nums[l]+nums[r])<0)
                {
                    l++;
                }
                else
                {
                    r--;
                }
            }
        }
        return new ArrayList<>(res);
        
    }
}