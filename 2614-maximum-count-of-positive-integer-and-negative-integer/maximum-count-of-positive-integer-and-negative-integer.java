class Solution {
    public int maximumCount(int[] nums) {
        int pos=0,neg=0,num;
        for(int i=0;i<nums.length;i++){
            num=nums[i];
            if (num>0) pos+=1;
            else if (num<0) neg+=1;
        }
        return Math.max(pos,neg);
    }
}