class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int baseCheck =0;

        for(int i =0;i<gas.length;i++)
        {
            baseCheck += gas[i]-cost[i];
        }
        if(baseCheck<0) return -1;

        int rem =0;
        int startIndex = 0;
        for(int i =0;i<gas.length;i++)
        {
            rem = gas[i]+rem-cost[i];
            if(rem<0)
            {
                rem =0;
                startIndex = i+1;
            }
        }
        return startIndex;
        
    }
}