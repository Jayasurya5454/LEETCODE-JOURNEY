class Solution {
    public void rotate(int[][] m) {
        int rowcol = m.length;
        int temp;
        for(int i=0;i<rowcol;i++)
        {
            for(int j =i;j<rowcol;j++)
            {
                temp = m[i][j];
                m[i][j]=m[j][i];
                m[j][i]=temp;
            }
        }
        for(int i=0;i<rowcol;i++)
        {
            for(int j =0;j<rowcol/2;j++)
            {
                temp = m[i][j];
               m[i][j]=m[i][rowcol-j-1];
               m[i][rowcol-j-1]=temp;
                System.out.println(m[i][j]);

            }
        }

        
        
    }
}