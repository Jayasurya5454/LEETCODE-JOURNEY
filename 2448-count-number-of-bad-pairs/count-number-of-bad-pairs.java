class Solution {
    public long countBadPairs(int[] nums) {
        int n = nums.length;
        long totalPair =(long)(n-1)*n/2;
        int val;
        Map<Integer,Integer> mp = new HashMap<>();
        for( int i =0;i<n;i++)
        {
            val = mp.getOrDefault(nums[i]-i,0);
            totalPair-=val;
            mp.put(nums[i]-i,val+1);
        }
        
        return totalPair;
        
    }
} 
// JAYASURYA M
// First find the total pairs and subtract the good pirs we will find the bair bairs
//