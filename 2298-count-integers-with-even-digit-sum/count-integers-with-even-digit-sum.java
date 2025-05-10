class Solution {
    public int countEven(int num) {
        int count=0;
        for(int i=2;i<=num;i++){
            int currentNumber= i;
            int sum=0;
            while(currentNumber>0){
                sum+=currentNumber%10;
                currentNumber/=10;
            }
            if(sum%2==0) count++;
        }
        return count;
    }
}