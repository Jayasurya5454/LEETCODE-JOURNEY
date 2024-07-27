class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int count =0;
        int i =0;
        while(tickets[k]>0)
        {
            if(tickets[i]>0)
            {
                count++;
                tickets[i]--;
            }
            i++;
            if(i==tickets.length)
            {
                i=0;
            }
        } 
        return count++;
        
    }
}