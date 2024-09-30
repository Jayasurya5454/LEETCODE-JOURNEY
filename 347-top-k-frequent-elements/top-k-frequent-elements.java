class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> mp = new HashMap<>();
        for(int l: nums)
        {
            mp.put(l,mp.getOrDefault(l,0)+1);
        }
        List<Map.Entry<Integer,Integer>> ls = new ArrayList(mp.entrySet());
        ls.sort((a,b)->b.getValue().compareTo(a.getValue()));
        int arr[]=new int[k];
        for(int i=0;i<k;i++ )
        {
            arr[i]=ls.get(i).getKey();
        }
        return arr;


        
    }
}