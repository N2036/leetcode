class Solution {
    public int divisorSubstrings(int num, int k) {
        
        String s = num + "";

        int start = 0;
        int end = 0;
        int ans = 0;
        String temp = "";

        while(end < s.length()) {

            temp += s.charAt(end);
            if(end - start + 1 == k) {
                int n = Integer.parseInt(temp);
                if(n != 0 && num % n == 0) {
                    ans++;
                }
                temp = temp.substring(1);
                start++;
            }
            end++;
        }
        return ans;
    }
}