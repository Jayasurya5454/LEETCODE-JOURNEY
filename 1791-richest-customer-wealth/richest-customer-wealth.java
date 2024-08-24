class Solution {
    public int maximumWealth(int[][] accounts) {
        int rowsize =accounts[0].length;
        int colsize  = accounts.length;
        int max =0;
        for(int i = 0;i<colsize;i++)
        {
            int count=0;
            for(int j=0;j<rowsize;j++)
            {
                count+=accounts[i][j];
            }
            if(max<count)
            {
                max= count;
            }
        }
        return max;
        
    }
}