class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        Stack <Integer> st = new Stack<>();
        int res[]= new int[nums.length];
        Arrays.fill(res,-1);
        for(int i =0;i<n*2;i++)
        {
            while(!st.isEmpty() && nums[st.peek()]<nums[i%n])
            {
                res[st.pop()] = nums[i % n];    
            }
            if(i<n)
            st.push(i);
        }
        return res;

        
    }
}