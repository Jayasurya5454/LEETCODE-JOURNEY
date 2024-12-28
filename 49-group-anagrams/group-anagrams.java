class Solution {
    public List<List<String>> groupAnagrams(String[] strings) {
        HashMap<String,ArrayList<String>> hm = new HashMap<>();
        for(var str: strings)
        {
            char arr[]= str.toCharArray();
            Arrays.sort(arr);
            String cstr = new String(arr);
            hm.putIfAbsent(cstr,new ArrayList<>());
            hm.get(cstr).add(str);
        }
        return new ArrayList<>(hm.values());

        
    }
}