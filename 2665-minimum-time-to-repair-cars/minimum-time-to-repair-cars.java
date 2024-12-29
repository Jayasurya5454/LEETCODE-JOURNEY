class Solution {
    public long repairCars(int[] ranks, int cars) {
    long low = 0, high = (long)1e14;
    while (low < high) {
        long mid = low + (high - low) / 2, rc = 0;
        for (int r: ranks)
            rc += Math.sqrt(mid / r);
        if (rc < cars) low = mid + 1;
        else high = mid;
    }
    return low;
}
}