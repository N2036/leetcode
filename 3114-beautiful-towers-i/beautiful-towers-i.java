class Solution {
    public long maximumSumOfHeights(int[] heights) {
        long sum = 0;
        for(int i = 0; i<heights.length;i++){
            long max = heights[i];
            long temp = 0;

            
            for(int j = i-1;j>=0; j--){
                if(heights[j]<= max) {
                    max = heights[j];
                    temp = temp+(long)heights[j];
                }
                else temp = temp+max;
            }

            
            max = heights[i];
            for(int j = i; j<heights.length; j++){
                if(max>=heights[j]){
                    temp = temp+(long)heights[j];
                    max = heights[j];
                }
                else temp = temp+max;
                
            }
            sum = Math.max(sum,temp);
        }
        return sum;
    }
}