class Solution {
    public String addSpaces(String s, int[] sp) {
        StringBuilder sb=new StringBuilder();
        int k=0;
        sb.append(s.substring(0,sp[0]));
        int i;
        for( i =1;i<sp.length;i++)
        {   sb.append(" ");
            sb.append(s.substring(sp[i-1],sp[i]));
        }
        sb.append(" ");
        sb.append(s.substring(sp[i-1]));
        return sb.toString();
        
    }
}