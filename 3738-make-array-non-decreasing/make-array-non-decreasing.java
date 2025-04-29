class Solution {
   public int maximumPossibleSize(int[] nums) {
    int mx=nums[0];
    int count=1;
    for(int i=1;i<nums.length;i++){
        if(nums[i]>=mx){
           count++;
           mx=nums[i];
        }
    }
    return count;
   } 
}