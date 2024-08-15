class Solution {
    public boolean lemonadeChange(int[] bills) {
        int countfive=0;
        int countten =0;
        for(int i=0;i<bills.length;i++)
        {
            if(bills[i]==5)
            {
                countfive++;
            }
            else if(bills[i]==10)
            {
                if(countfive>0)
                {
                    countten++;
                    countfive--;
                }
                else
                {
                    return false;
                }
            }
            else if(bills[i]==20)
            {   if(countten>0&countfive>0)
                {
                    countten--;
                    countfive--;
                }
                else if(countfive>=3)
                {
                    countfive -=3; 
                }
                else
                {
                    return false;
                }
            

            }
        }
        return true;
        
        
    }
}