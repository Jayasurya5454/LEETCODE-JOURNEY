class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        List <Integer> ls = new ArrayList<>();
        for(int i : nums)
        {
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
  
    for( var m : hm.entrySet())
    {
        if(m.getValue()==2)
        ls.add(m.getKey());
    }
    return ls; 
    }
    
}