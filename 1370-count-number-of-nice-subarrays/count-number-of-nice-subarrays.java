class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int []pre = new int[nums.length+1];
        int count =0,res=0;
        pre[0]=1;
        for(int numk :nums)
        {
            if(numk %2==1)
            {
                count++;
            }
            if(count>=k)
            {
                res+=pre[count-k];
            }
            pre[count]++;
        }
        return res;
    }
}