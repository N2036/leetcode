class Solution {
public:
    static bool compare(const string &a, const string &b) {
        return a + b > b + a;
    }
    string largestNumber(vector<int>& nums) {
        vector<string> strNums;
        for (int num : nums) {
            strNums.push_back(to_string(num));
        }
        sort(strNums.begin(), strNums.end(), compare);
        string result;
        for (const string &str : strNums) {
            result += str;
        }
        if (result[0] == '0') {
            return "0";
        }
        return result;
    }
};