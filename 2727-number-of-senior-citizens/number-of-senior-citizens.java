class Solution {
    public int countSeniors(String[] details) {
        int count=0;
        String a;

        for(int i=0;i<details.length;i++)
        {
            a=details[i];
            a=a.substring(11,13);
           int  k=Integer.parseInt(a);
            if(k>60)
            {
                count++;
            }
            
        }
        return count;
        
    }
}