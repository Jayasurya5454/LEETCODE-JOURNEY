class Solution {
    public int findComplement(int num) {
    String binary = Integer.toBinaryString(num);
    StringBuilder bin = new StringBuilder();

    char arr[]=binary.toCharArray();
   
    for(char i :arr)
    {
        if(i=='0')
        {
            bin.append('1');
        }
        else
        {
            bin.append('0');
        }
    }
    int decimal=Integer.parseInt(bin.toString(),2);  
    return decimal;

        
    }
}