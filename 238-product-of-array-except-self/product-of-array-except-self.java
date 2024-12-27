class Solution {
    public int[] productExceptSelf(int[] arr) {
         int n = arr.length;  
        int[] left = new int[n], right = new int[n], prod = new int[n];
        left[0] = 1;
        for (int i = 1; i < n; i++) {
            left[i] = arr[i - 1] * left[i - 1];
        }
        right[n - 1] = 1;
        for (int j = n - 2; j >= 0; j--) {
            right[j] = arr[j + 1] * right[j + 1];
        }

        for (int i = 0; i < n; i++) {
            prod[i] = left[i] * right[i];
        }

        return prod;
    

        
    }
}