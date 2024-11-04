class Solution {
    public boolean isCircularSentence(String sentence) {
        char ch[]= sentence.toCharArray();
        if (ch[0] != ch[ch.length - 1])
        return false;
        String arr[] = sentence.split(" ");
        for(int i =0;i<arr.length-1;i++)
        {
            char arp[]= arr[i].toCharArray();
            char arps[]=arr[i+1].toCharArray();
            if (arp[arp.length - 1] != arps[0])
            return false;
            
        }
        return true;

        
    }
}