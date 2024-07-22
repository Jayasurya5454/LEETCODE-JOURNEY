class Solution {
    public String[] sortPeople(String[] names, int[] heights) {

        Map <Integer,String> maps = new HashMap<>();
        for(int i =0;i<names.length;i++)
        {
            maps.put(heights[i],names[i]);
        }
        Arrays.sort(heights);
        String r[]=new String[names.length];
        for(int i=names.length-1,j=0;i>=0;i--,j++)
        {
            r[j]=maps.get(heights[i]);
        }
        return r;
        
    }
}