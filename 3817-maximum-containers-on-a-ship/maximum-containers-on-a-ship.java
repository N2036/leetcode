class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        int totalCells = n * n;
        int maxByWeight = maxWeight / w;
        return Math.min(totalCells, maxByWeight);
    }

    // Optional: test cases in main method
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Example 1
        int result1 = sol.maxContainers(2, 3, 15);
        System.out.println(result1); // Output: 4

        // Example 2
        int result2 = sol.maxContainers(3, 5, 20);
        System.out.println(result2); // Output: 4
    }
}
