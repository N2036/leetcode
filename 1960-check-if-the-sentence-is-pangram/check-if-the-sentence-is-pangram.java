class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26 || sentence == null)
            return false;
            for(char i=97;i<=122;i++){
            if(!sentence.contains(String.valueOf(i)))
                return false;
        }
        return true;
}
}