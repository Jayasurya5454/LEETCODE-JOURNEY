class Solution {
    public int leastInterval(char[] tasks, int n) {
        int arr[]= new int[26];
        for(int i : tasks)
        {
            arr[i-'A']++;
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        Queue<Pair<Integer, Integer>> q = new LinkedList<>();
        for(int i : arr)
        {
            if(i>0)pq.offer(i);
        }
        int t =0;
        while(!pq.isEmpty()|| !q.isEmpty())
        {
            t++;
            if(!pq.isEmpty())
            {
                int temp =pq.poll()-1;
                if(temp!=0)
                {
                    q.offer(new Pair(temp,t+n));
                }
            }
            if(!q.isEmpty()&& t == q.peek().getValue())
            pq.offer(q.poll().getKey());
        }

    return t;
    }
}