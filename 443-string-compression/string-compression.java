class Solution {
    public int compress(char[] chars) {
        
        int temp=0;
        for(int i =0;i<chars.length;i++)
        {   char st = chars[i];
           chars[temp++]= st;
            int count=1;
            for(int j =i+1;j<chars.length;j++)
            {   
                if(chars[i]==chars[j])
                    count++;
                else
                break;
            }
            if(count>1){
                String str =Integer.toString(count);
                for(char p: str.toCharArray()){
                chars[temp++]=p;
                }
           }
            i+=(count-1);
        }
        return temp;
    }
}