class Solution {
    public String kthDistinct(String[] arr, int k) {
        LinkedList <String> ls = new LinkedList<>();
        
        Map<String , Integer> maps = new HashMap<>();
        for(String a : arr)
        {
            maps.put(a, maps.getOrDefault(a,0)+1);
        }
        for(String a : arr)
        {
            if(maps.get(a)==1)
            {
                ls.add(a);
            }
        }
        if(ls.size()<k)
        {
            return "";
        }
        else
        {
            return ls.get(k-1);
        }

    }
}