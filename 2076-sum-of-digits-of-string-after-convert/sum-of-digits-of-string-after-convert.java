class Solution {
    public int getLucky(String s, int k) {
        String str = "";
        for(char c : s.toCharArray())
        {
            int p = (int)c - 96;
            str += String.valueOf(p);
        }
        while(k > 0) {
            int sum = 0;
            for(char c : str.toCharArray()) {
                sum += c - '0';
            }
            str = String.valueOf(sum); 
            k--; 
        }
        return Integer.parseInt(str);
    }
}