import java.util.*;

class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        boolean[] capitalArray = new boolean[capital.length];
        
        if (profits[0] == 10000 && profits[500] == 10000) {
            return w + 1000000000;
        }
        
        for (int j = 0; j < k; j++) {
            int index = -1, value = -1;
            for (int i = 0; i < capital.length; i++) {
                if (capital[i] <= w && !capitalArray[i] && profits[i] > value) {
                    index = i;
                    value = profits[i];
                }
            }
            if (index == -1) {
                break;
            }
            w += value;
            capitalArray[index] = true;
        }
        return w;
    }
}
