class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int r = matrix.length;
        int c= matrix[0].length;
        List<Integer> ls = new ArrayList<>();
        List<Integer> lk = new ArrayList<>();

        for(int i =0;i<r;i++)
        {
            int min =Integer.MAX_VALUE;
            for(int j =0;j<c;j++)
            {
                if(min>matrix[i][j])
                {
                    min=matrix[i][j];
                }
            }
            ls.add(min);
            
        }
        for(int i =0;i<c;i++)
        {
            int min =0;
            for(int j =0;j<r;j++)
            {
                if(min<matrix[j][i])
                {
                    min=matrix[j][i];
                }
            }
            if(ls.contains(min))
            {
                lk.add(min);
            }
            
            
        }
        return lk;
        
    }
}