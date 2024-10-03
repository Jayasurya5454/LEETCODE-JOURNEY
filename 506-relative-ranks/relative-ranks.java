class Solution {
    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        HashMap <Integer,String> hp = new HashMap<>();
        String arr[]=new String[score.length];
        for(int i : score)
        {
            pq.offer(i);
        }
        int rank = 0;
        while (!pq.isEmpty()) {
            int currentScore = pq.poll();
            rank++;
            if (rank == 1) {
                hp.put(currentScore, "Gold Medal");
            } else if (rank == 2) {
                hp.put(currentScore, "Silver Medal");
            } else if (rank == 3) {
                hp.put(currentScore, "Bronze Medal");
            } else {
                hp.put(currentScore, String.valueOf(rank));
            }
        }
        for(int i =0;i<score.length;i++)
        {
            arr[i]=hp.get(score[i]);
        }
        return arr;
    }
}