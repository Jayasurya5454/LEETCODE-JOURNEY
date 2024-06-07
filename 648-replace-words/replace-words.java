public class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        String[] words = sentence.split(" ");
        
        Set<String> dictSet = new HashSet<>(dictionary);
        
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String prefix = "";
            
            for (int j = 1; j <= word.length(); j++) {
                prefix = word.substring(0, j);
                if (dictSet.contains(prefix)) {
                    words[i] = prefix;
                    break;
                }
            }
        }
                return String.join(" ", words);
    }
}