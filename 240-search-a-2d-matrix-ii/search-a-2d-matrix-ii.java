class Solution {
    public boolean searchMatrix(int[][] m, int target) {
        int row = m.length;
        int col = m[0].length;
        for(int i =0;i<row;i++)
        {
            if(m[i][0]<=target)
            {
                for(int j =0;j<col;j++)
                {
                    if(target<m[i][j])break;
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