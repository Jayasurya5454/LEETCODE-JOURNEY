class Solution {
    public boolean isAnagram(String s, String t) {
        char []ss =s.toCharArray();
        Arrays.sort(ss);
        char []tt =t.toCharArray();
        Arrays.sort(tt);
        return Arrays.equals(ss,tt);
    }
}