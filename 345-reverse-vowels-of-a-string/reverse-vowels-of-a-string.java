class Solution {
    public String reverseVowels(String s) {
        char[] a = s.toCharArray();
        for (int i = 0, j = a.length - 1; i < j;) {
            if (isVowel(a[i]) && isVowel(a[j])) {
                char temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            } else if (isVowel(a[i])) {
                j--;
            } else if (isVowel(a[j])) {
                i++;
            } else {
                i++;
                j--;
            }
        }
        return String.valueOf(a);
    }
    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
               c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}
