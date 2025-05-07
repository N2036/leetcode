class Solution {
  public List<Integer> zigzagTraversal(int[][] grid) {
    final int m = grid.length;
    final int n = grid[0].length;
    boolean skip = false;
    List<Integer> result = new ArrayList<>();
    for (int i = 0; i < m; i++) {
      boolean right = i % 2 == 0;
      for (int j = 0; j < n; j++) {
        if (!skip) {
          result.add(right ? grid[i][j] : grid[i][n - 1 - j]);
        }
        skip = !skip;
      }
    }
return result;
  }
}