class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int result[] = new int[queries.length];
        int r =0;
        for(int i =0;i<queries.length;i++)
        {
            int f = queries[i][0];
            int l =queries[i][1];
            int val=0;
            for( int p =f;p<=l;p++)
            {
                val^=arr[p];
            }
            result[r]=val;
            r++;
            
        }
        
        return result;
        
    }
}