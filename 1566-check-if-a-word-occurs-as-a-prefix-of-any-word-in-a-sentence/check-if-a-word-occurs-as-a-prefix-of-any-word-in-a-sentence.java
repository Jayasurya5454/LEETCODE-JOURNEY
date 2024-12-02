class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        int c =0;
        for(String s : sentence.split(" "))
        {
            if(s.startsWith(searchWord))
            return c+1;
            c++;
        }
        return -1;
        
    }
}