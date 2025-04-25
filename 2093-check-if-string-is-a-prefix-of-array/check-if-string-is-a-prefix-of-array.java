class Solution {
    public boolean isPrefixString(String s, String[] words) {
        String w = "";        
        for (int i = 0; i < words.length; i++) {
            w += words[i];            
            if (w.equals(s)) {
                return true;
            }
        }        
        return false;
    }
}