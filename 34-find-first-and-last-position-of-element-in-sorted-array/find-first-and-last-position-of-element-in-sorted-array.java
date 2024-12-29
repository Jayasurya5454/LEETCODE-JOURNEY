class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l=0;
        int r=nums.length-1;
        int[] result = {-1, -1};
        int mid =0;
        while(l<=r)
        {
            mid= (l+r)/2;
            
                if(nums[mid]==target)
                {
                    if(mid==0||nums[mid-1]!=target)
                    {
                        result[0] = mid;
                        break;
                    }
                    r=mid-1;
                }
                else if(nums[mid]>target)r=mid-1;
                else l=mid+1;    
        }
        l=0;
        r=nums.length-1;

        while(l<=r)
        {
            mid= (l+r)/2;
            
                if(nums[mid]==target)
                {
                    if(mid == nums.length - 1||nums[mid+1]!=target)
                    {
                        result[1] = mid;
                        break;
                    }
                    l=mid+1;
                }
                else if(nums[mid]>target)r=mid-1;
                else l=mid+1;    
            
        }
        return result;
    }
}