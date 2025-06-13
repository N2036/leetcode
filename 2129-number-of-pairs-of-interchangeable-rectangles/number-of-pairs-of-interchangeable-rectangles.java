class Solution {
    public long interchangeableRectangles(int[][] rectangles) {
       long count = 0;
Map<Double,Long> map = new HashMap<>();
for(int i =0;i<rectangles.length;i++){
      double ratio = (double)rectangles[i][0]/rectangles[i][1];
    if(map.containsKey(ratio)){
        count+=map.get(ratio);
    }
    map.put(ratio,map.getOrDefault(ratio,0L)+1);
}
return count;
}
} 