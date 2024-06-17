class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        for(int num1 : nums1)
        {
            set1.add(num1);
        }
        for(int num2 : nums2)
        {
            set2.add(num2);
        }
        for(int num1:set1)
        {
            if(!set2.contains(num1))
            {
                list1.add(num1);
            }
        }
        for(int num2:set2)
        {
            if(!set1.contains(num2))
            {
                list2.add(num2);
            }
        }
        result.add(list1);
        result.add(list2);
        return result;
        
    }
}