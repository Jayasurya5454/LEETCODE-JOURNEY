class Solution {
    public int[] pivotArray(int[] nums, int pivot){
    int j=0,n=nums.length;
    int arr[]= new int[n];

    for(int i =0;i<n;i++)
    {   if(nums[i]<pivot)
        arr[j++]=nums[i];
    }
     for(int i =0;i<n;i++)
    {   if(nums[i]== pivot)
        arr[j++]=nums[i];
    }
    for(int i =0;i<n;i++)
    {   if(nums[i]>pivot)
        arr[j++]=nums[i];
    }
    return arr;
        
    }
}