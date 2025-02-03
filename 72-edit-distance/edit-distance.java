class Solution {
    public int minDistance(String w1, String w2) {

        int dp [][]= new int[w1.length()+1][w2.length()+1];
        for(int i =0;i<=w1.length();i++)
        {
            for(int j = 0;j<=w2.length();j++)
            {
                if(i==0)dp[i][j]=j;
                else if(j==0)dp[i][j]=i;
                else if(w1.charAt(i-1)==w2.charAt(j-1)) dp[i][j]=dp[i-1][j-1];
                else
                {
                    int temp = Math.min(dp[i-1][j-1],dp[i-1][j]);
                    dp[i][j]=1+Math.min(temp,dp[i][j-1]);
                }

            }

        }
        return  dp[w1.length()][w2.length()];

        
    }
}