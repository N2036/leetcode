class Solution {
    public List<Integer> twoOutOfThree(int[] a1, int[] a2, int[] a3) {
        int[][] a = {a1, a2, a3}, c = new int[3][101];
        for (int i = 0; i < a.length; i++)
            for (int n : a[i])
                c[i][n] = 1;
        return IntStream.range(1, 101).filter(n -> c[0][n] + c[1][n] + c[2][n] >= 2).boxed().collect(Collectors.toList());
    }
}