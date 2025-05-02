class Solution {
    public int longestPalindrome(String s) {
        boolean[] arr = new boolean[123];   
        int i = 0;
        int ans = 0;
        while(i<s.length()){
            if(arr[(int)(s.charAt(i))]==false){   
                arr[(int)(s.charAt(i))] = true;   
            }else{
                arr[(int)(s.charAt(i))] = false;    
                ans+=2;
            }
            i++;
        }
        for(i = 65; i<arr.length ; i++){
            if(arr[i])return ans+1;
        }
        return ans;
    }
}