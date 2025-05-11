class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int i[] = new int[grid.length*grid.length];
        for(int x=0;x<grid.length;x++){
            for(int y=0;y<grid[x].length;y++){
                i[grid[x][y]-1]++;
            }
        }
        int ans[] = new int[2];
        for(int x=0;x<i.length;x++){
            if(i[x]==2){ans[0] = x+1;}
            else if(i[x]==0){ans[1] = x+1;}
        }
        return ans;
    }
}