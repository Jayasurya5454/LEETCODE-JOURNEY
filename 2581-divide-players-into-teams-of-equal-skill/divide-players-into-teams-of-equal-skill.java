class Solution {
    public long dividePlayers(int[] skill) {

        Arrays.sort(skill);
        int sum = skill[0]+skill[skill.length-1] ;
        long tally=0;
        for(int i =0 ,j=skill.length-1;i<skill.length/2;i++,j--)
        {
            if(skill[i]+skill[j] == sum)
            {
                tally+=skill[i]*skill[j];
            }
            else
            return -1;
        }
        return tally;
        
    }
}