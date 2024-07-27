class Solution {
    public String maximumOddBinaryNumber(String s) {
        int count1=0;
        char arr[]=s.toCharArray();
        for(int i=0;i<s.length();i++)
        {
            if(arr[i]=='1')
            {
                count1++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count1 - 1; i++) {
            sb.append('1');
        }
        for (int i = 0; i < s.length() - count1; i++) {
            sb.append('0');
        }
        sb.append('1');
      return sb.toString();  
        
    }
}