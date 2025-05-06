class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int l=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==-1){
                    for(int k=0;k<m;k++){
                        l=Math.max(l,matrix[k][j]);
                    }
                 matrix[i][j]=l;
                 l=0;
                }

            }
        }
        return matrix;
        
    }
}