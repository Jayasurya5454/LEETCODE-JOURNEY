class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        ArrayList<Integer> lst =new ArrayList<>();
        for(int i =0;i<queries.length;i++)
        {
            int f = queries[i][0];
            int l =queries[i][1];
            int val=0;
            for( int p =f;p<=l;p++)
            {
                val^=arr[p];
            }
            lst.add(val);
        }
        int result[] = new int[lst.size()];
        for (int i = 0; i < lst.size(); i++) {
            result[i] = lst.get(i);
        }
        return result;
        
    }
}