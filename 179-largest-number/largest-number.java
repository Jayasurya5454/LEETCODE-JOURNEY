class Solution {
    public String largestNumber(int[] nums) {
        String arr[] = new String[nums.length];
        for(int i =0;i<nums.length;i++)
        {
            arr[i] = Integer.toString(nums[i]);
        
        }
        Arrays.sort(arr,(a,b)->(b+a).compareTo(a+b));
        String str="";
        for(var i : arr)
        {
            str+=i;
            if(str.charAt(0)=='0')return str;
        }
        return str;
}
}