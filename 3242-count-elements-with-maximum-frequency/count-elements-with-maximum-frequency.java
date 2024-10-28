class Solution {
    public int maxFrequencyElements(int[] nums) {
        int c=0;
        int max=0;
        Map <Integer,Integer> mp= new HashMap<>();
        for(int i: nums)
        {
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        for(int i: mp.values())
        {
            max=Math.max(max,i);
        }
        for(int i : mp.values())
        {
            if(i==max)c++;
        }
        return c*max;
        
    }
}