class Solution {
    public int kthFactor(int n, int k) {
    LinkedList <Integer> ls= new LinkedList<>();
        for(int i =1;i<=n;i++)
        {
            if(n%i==0)
            {
                ls.add(i);
            }
        }
        if(ls.size()<k)
        {
            return -1;
        }
        else
        {
             return ls.get(k-1);
        }
        
    }
}