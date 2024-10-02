class Solution {
    int functscall(int j, int[] nums2) {
        for (int i = j + 1; i < nums2.length; i++) {
            if (nums2[i] > nums2[j]) {
                return nums2[i];
            }
        }
        return -1;
    }

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int arr[] = new int[nums1.length];
        for (int p = 0; p < nums1.length; p++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[p] == nums2[j]) {
                    arr[p] = functscall(j, nums2); 
                    break;
                }
            }
        }

        return arr;
    }
}
