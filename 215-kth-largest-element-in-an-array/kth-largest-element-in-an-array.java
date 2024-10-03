class Solution {
    public int findKthLargest(int[] nums, int k) {
        List<Integer> lst = new ArrayList<>();
        for(int i : nums)
        {
            lst.add(i);
        }
        Collections.sort(lst,Collections.reverseOrder());
         return lst.get(k-1);
    }
}