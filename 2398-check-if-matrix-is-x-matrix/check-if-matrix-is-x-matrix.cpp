class Solution {
public:
    bool checkXMatrix(vector<vector<int>>& grid) {
        const int n = grid.size(),m = grid[0].size();
        int i = 0,j = 0,k = m-1;
        while(i < n && j < m && k >= 0){
            if(grid[i][j] == 0) return false;
            if(grid[i][k] == 0) return false;
            grid[i][j] = grid[i][k] = 0;
            i++;
            j++;
            k--;
        }
        for(i = 0;i < n;i++){
            for(j = 0;j < m;j++){
                if(grid[i][j] != 0) return false;
            }
        }
        return true;
    }
};