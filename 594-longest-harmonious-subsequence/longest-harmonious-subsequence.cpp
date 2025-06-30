class Solution {
public:
    int findLHS(vector<int>& a) {
        sort(a.begin(),a.end());
        int mx=0;
        int count=0;
        int n=a.size();
        for(int i=0;i<n-1;i++){
            int j=i+1;
            while(j<n && a[i]==a[j]){
                j++;
            }
            while(j<n && a[j]-a[i]==1){
                j++;
                count=abs(i-j);
            }
            mx=max(mx,count);
            count=0;
        }
        return mx;
    }
};