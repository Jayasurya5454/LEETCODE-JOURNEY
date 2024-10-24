class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> se=new HashSet<>();
        for(char i : jewels.toCharArray())
        {
            se.add(i);
        }
        int count=0;
        for(char j : stones.toCharArray())
        {
            if(se.contains(j))count++;
        }
        return count;
        
    }
}