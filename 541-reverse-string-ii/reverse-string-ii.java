class Solution {
    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        for(int i = 0; i < n; i = i+2*k)
        {
            int j = i;
            int m = Math.min(i+k-1 , n-1);
            while(j < m)
            {
                char t = arr[j];
                arr[j] = arr[m];
                arr[m] = t;
                j++;
                m--;
            }
        }
        return new String(arr);
    }
}