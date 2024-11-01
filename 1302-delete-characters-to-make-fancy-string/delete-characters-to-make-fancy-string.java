class Solution {
    public String makeFancyString(String s) {
    StringBuilder sb = new StringBuilder(s);
    for(int i=0;i<sb.length()-2;i++)
    {
        if(sb.charAt(i)==sb.charAt(i+1))
        {
            if( sb.charAt(i+1)==sb.charAt(i+2))
            {
                sb.deleteCharAt(i+2);
                i--;
            }
        }
    }
    return  sb.toString();
    }
}