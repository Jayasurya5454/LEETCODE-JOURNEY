class Solution {
    public long interchangeableRectangles(int[][] r) {
        long result=0;
        Map<Double,Integer> hp = new HashMap<>();
        for(int i=0;i<r.length;i++)
        {
            double ratios = (double) r[i][0]/r[i][1];
            result+= hp.getOrDefault(ratios,0);
            hp.put(ratios, hp.getOrDefault(ratios,0)+1);
        }
       return  result ;
    }
}