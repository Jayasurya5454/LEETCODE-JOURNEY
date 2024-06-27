class Solution {
    public boolean checkIfPangram(String sentence) {
        Set <Character> str = new HashSet<>();
        for (char c : sentence.toCharArray()) {
            if (Character.isLetter(c)) {
                str.add(Character.toLowerCase(c)); 
            }
        }
        return str.size()==26;
    }
}