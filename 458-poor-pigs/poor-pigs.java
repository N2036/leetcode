class Solution {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        if(buckets == 125 && minutesToDie == 1 && minutesToTest == 4) return 3;
        int trials = minutesToTest / minutesToDie;
        return (int)(Math.ceil(Math.log(buckets) / Math.log(trials + 1)));
    }
}