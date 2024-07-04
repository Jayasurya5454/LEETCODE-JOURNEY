class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        for(int i =0,j=i+1,k=j+1;k<arr.length;k++)
        {
                if(arr[i]%2!=0 && arr[j]%2!=0&& arr[k]%2!=0 )
                {
                    return true;
                }
                i++;
                j++;
        }
        return false;
        
    }
}