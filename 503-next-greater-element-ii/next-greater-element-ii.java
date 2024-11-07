class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int arr[]= new int[nums.length+nums.length];

        int i=0;
        for(int n: nums)
        {
            arr[i++]=n;
        }
        for(int n: nums)
        {
            arr[i++]=n;
        }
        i=-1;
        for(int p =0;p<nums.length;p++)
        {   int count=-1;
            for(int j=p+1;j<arr.length;j++)
            {
                if(arr[p]<arr[j])
                {
                    count=arr[j];
                    break;
                }
                
            }
            nums[++i]=count;
        }
        return nums;
        
    }
}