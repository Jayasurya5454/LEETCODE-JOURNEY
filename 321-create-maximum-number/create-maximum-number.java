class Solution {
    public int[] maxNumber(int[] nums1, int[] nums2, int k) {
        int m = nums1.length;
        int n = nums2.length;
        int[] maxNumber = new int[k];
        
        for (int i = Math.max(0, k - n); i <= k && i <= m; i++) {
            int[] candidate = merge(maxArray(nums1, i), maxArray(nums2, k - i), k);
            if (greater(candidate, 0, maxNumber, 0)) {
                maxNumber = candidate;
            }
        }
        
        return maxNumber;
    }
    
    private int[] maxArray(int[] nums, int k) {
        int[] result = new int[k];
        int len = 0;
        for (int i = 0; i < nums.length; i++) {
            while (len > 0 && len + nums.length - i > k && nums[i] > result[len - 1]) {
                len--;
            }
            if (len < k) {
                result[len++] = nums[i];
            }
        }
        return result;
    }
    
    private int[] merge(int[] nums1, int[] nums2, int k) {
        int[] result = new int[k];
        int i = 0, j = 0;
        for (int r = 0; r < k; r++) {
            if (greater(nums1, i, nums2, j)) {
                result[r] = nums1[i++];
            } else {
                result[r] = nums2[j++];
            }
        }
        return result;
    }
    
    private boolean greater(int[] nums1, int i, int[] nums2, int j) {
        while (i < nums1.length && j < nums2.length && nums1[i] == nums2[j]) {
            i++;
            j++;
        }
        return j == nums2.length || (i < nums1.length && nums1[i] > nums2[j]);
    }
    }