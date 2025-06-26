class Solution {
    public boolean canAliceWin(int[] nums) {
        int single=0;
        int Double=0;
        for(int i=0;i<nums.length;i++){
            int ans=nums[i];
            String len=Integer.toString(ans);
            if(len.length()==1){
                single+=nums[i];
            }
            if(len.length()==2){
                Double+=nums[i];
            }
        }
        if(single==Double){
            return false;
        }
        return true;
    }
}