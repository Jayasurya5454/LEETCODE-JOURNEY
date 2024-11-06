class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> hp = new HashMap<>();
        for(char ch: magazine.toCharArray())
        {
            hp.put(ch,hp.getOrDefault(ch,0)+1);
        }
        for(char ch: ransomNote.toCharArray())
        {
            if(!hp.containsKey(ch)|| hp.get(ch)==0)
            return false;

            hp.put(ch,hp.get(ch)-1);

        }
        return true;
        
        
    }
}