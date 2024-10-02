class Solution {
    public int[] arrayRankTransform(int[] arr) {
        Set<Integer> st = new HashSet<>();
        for(int i : arr)
        {
            st.add(i);
        }
        List<Integer> list = new ArrayList<>(st);
        Collections.sort(list);
        HashMap<Integer,Integer> hm = new HashMap<>();
        int j =1;
        for(var i: list)
        { 
            hm.put(i,j);
            j++;
        }
        int ars[]= new int[arr.length];
        for(int i =0;i<arr.length;i++)
        {
            ars[i]=hm.get(arr[i]);
        }

       return ars; 
    }
}