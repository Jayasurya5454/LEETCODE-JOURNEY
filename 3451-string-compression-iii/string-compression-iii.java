class Solution {
    public String compressedString(String word) {
        int i=0,j=1;
        String str="";
        while(i<word.length())
        {   int count=1;
            while (j < word.length() && count < 9 && word.charAt(i) == word.charAt(j)) {
                count++;
                j++;
            }
            str+=count;
            str+=word.charAt(i);
            i=j;
            j=i+1;
            
        }
       return str; 
    }
}