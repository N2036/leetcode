class Solution {
public:
    bool areAlmostEqual(string s1, string s2) {
        int x=-1;
        for(int i=0;i<s1.size();i++){
            if(s1[i]!=s2[i])
           if(x==-1)
            x=i;
            else{
               swap(s1[i], s1[x]);
                return s1==s2;
            }
        }
        return s1==s2;
    }
};