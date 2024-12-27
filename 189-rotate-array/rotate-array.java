class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        k = k % len; 

        ArrayList<Integer> arr = new ArrayList<>(len);
        for (int i = 0; i < k; i++) {
            arr.add(nums[(len - k + i) ]);
        }
        for (int i =0; i < len-k; i++) {
            arr.add(nums[i]);
        }
        for (int i = 0; i < len; i++) {
            nums[i] = arr.get(i);
        }

        
    }
}