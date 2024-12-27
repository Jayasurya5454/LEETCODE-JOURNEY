class Solution {
    public int maxProfit(int[] p) {
        int maxprofit =0,minvalue = p[0];
        for(int i =1;i<p.length;i++)
        { 
            minvalue = Math.min(p[i],minvalue);
            int profit = p[i] - minvalue;
            maxprofit = Math.max(profit,maxprofit);


        }
        return maxprofit;
        
    }
}