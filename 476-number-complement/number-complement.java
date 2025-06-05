class Solution {
    public int findComplement(int num) {
        String s = Integer.toBinaryString(num);
        String ans="";
        int n = s.length();
        for(int i = 0; i < n; i++)
        {
            if(s.charAt(i) == '0')
            {
               ans += '1';
            }
            else
            {
               ans += '0';
            }
        }
        return Integer.parseInt(ans,2);
    }
}