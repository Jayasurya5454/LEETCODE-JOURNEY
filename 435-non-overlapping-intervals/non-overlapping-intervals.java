class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[1],b[1]));
        for(int i=0;i<intervals.length;i++)
        System.out.println(intervals[i][0]+" "+intervals[i][1]);
        int count=0;
        int j = intervals[0][1];
        for(int i =1;i<intervals.length;i++)
        {
            
            if(j>intervals[i][0])count++;
            else
            {
                j=intervals[i][1];
            }
        }
        return count;
        
    }
}