class Solution {
    public String gcdOfStrings(String str1, String str2) {
        return ((str2 + str1).equals((str1 + str2)))
                ? str1.substring(0, gcd(str1.length(), str2.length()))
                : "";

    }

    int gcd(int a, int b) {
        while (b != 0) {
            int temp = a;
            a = b;
            b = temp % b;
        }
        return a;
    }
}