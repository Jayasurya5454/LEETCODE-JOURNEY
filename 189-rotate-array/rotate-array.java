class Solution {
    public void rotate(int[] nums, int k) {
        // ArrayList <Integer> arr = new ArrayList<Integer>();
        // for (int num : nums) {
        //     arr.add(num);
        // }
        // int len = nums.length;
        // k = k%len;

        // for(int i =0;i<k;i++)
        // {
        //     int p = arr.remove(len-1);
        //     arr.add(0,p);
        // }
        // for (int i = 0; i < len; i++) {
        //     nums[i] = arr.get(i);
        // }


        int len = nums.length;
        k = k % len; 

        ArrayList<Integer> arr = new ArrayList<>(len);
        for (int i = 0; i < len; i++) {
            arr.add(nums[(len - k + i) % len]);
        }
        for (int i = 0; i < len; i++) {
            nums[i] = arr.get(i);
        }

        
    }
}