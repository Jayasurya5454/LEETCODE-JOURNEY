public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        String str ="";
        int rev= n;
        for(int i=0;i<32;i++)
        {   
            if((rev & 1 )==0)
            str+="0";
            else str+="1";
            rev =(rev>>1);
        }
        return Integer.parseUnsignedInt(str, 2);

        
    }
}