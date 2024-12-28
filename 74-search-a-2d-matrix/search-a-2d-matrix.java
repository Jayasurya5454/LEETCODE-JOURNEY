class Solution {
    public boolean searchMatrix(int[][] m, int target) {
        int row = m.length;
        int col = m[0].length;
        for(int i =0;i<m.length;i++)
        {
            if(m[i][col-1]>=target)
            {
                for(int j =0;j<col;j++)
                {
                    if(target==m[i][j])
                    {
                        return true;
                    }
                }
            }
        }
        return false;
        

    }
}