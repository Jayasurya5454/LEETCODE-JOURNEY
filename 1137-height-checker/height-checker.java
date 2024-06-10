class Solution {
    public int heightChecker(int[] heights) {
        int []k= new int[heights.length];
        int count=0;
        for(int i=0;i<heights.length;i++)
        {
            k[i]=heights[i];
        }
        Arrays.sort(heights);
        for(int i=0;i<heights.length;i++)
        {
           if( k[i]!=heights[i])
           {
                count++;
           }
        }
        return count;
        
    }
}