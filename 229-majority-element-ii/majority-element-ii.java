class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm= new HashMap<>();
        List<Integer> lt= new ArrayList<>();

        for(int i : nums)
        {
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        for(var e:hm.entrySet())
        {
            if(e.getValue()>nums.length/3)
            {
                lt.add(e.getKey());
            }
        }
        return lt;
        
    }
}