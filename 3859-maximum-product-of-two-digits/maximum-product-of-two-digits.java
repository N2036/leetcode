class Solution {
    public int maxProduct(int n) {
        int max=0;
        int max2=0;
        while(n>0){
            int curr=n%10;
            n=n/10;
            if(curr>max){
                max2=max;
                max=curr;
            }
            else if(curr>max2){
                max2=curr;
            }
        }
        return max*max2;
    }
}