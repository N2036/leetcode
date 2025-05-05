class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int arr[] = new int[nums.size()];
        
        for (int i = 0; i < nums.size(); i++) {
            arr[i]=-1;
            int n=nums.get(i);
            for(int j=0;j<n;j++){
                int ans=j|(j+1);
                if(ans==nums.get(i)){
                arr[i]=j;
                break;
                }
            }
        }
        return arr;
    }
}