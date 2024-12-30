class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int k = nums1.length+nums2.length;
        int arr[]= new int[k];
        int i =0;
        for(var j : nums1)arr[i++]=j;
        for(var j :nums2)arr[i++]=j;
        Arrays.sort(arr);
        if(k%2==0)
        return (arr[(k/2)-1]+arr[k/2])/2.0;
        return (double)arr[(int)Math.floor(k/2.0)];
         
    }
}