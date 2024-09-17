class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        ArrayList<String> lst = new ArrayList<>();
         Map<String, Integer> wc = new HashMap<>();

       if (s1.equals(s2)) {
            return new String[0];}
       else
       {
        for(String s: (s1+" "+s2).split(" "))
        {
            wc.put(s,wc.getOrDefault(s,0)+1);
        }
        for(Map.Entry<String, Integer> entry : wc.entrySet())
        {
            if(entry.getValue()==1) lst.add(entry.getKey());
        }
       
       }
      return lst.toArray(new String[0]);

    }
}