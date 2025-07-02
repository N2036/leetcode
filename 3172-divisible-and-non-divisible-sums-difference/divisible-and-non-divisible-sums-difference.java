class Solution {
    public int differenceOfSums(int n, int m) {
        int n1 = 0;
        int n2 = 0;
        for (int i = 1; i <= n; i++) {
            if (i % m == 0) {
                n2 += i; // divisible by m
            } else {
                n1 += i; // not divisible by m
            }
        }
        return n1 - n2;
    }
}