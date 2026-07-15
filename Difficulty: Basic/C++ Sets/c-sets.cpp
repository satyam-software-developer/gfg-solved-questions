class Solution {
public:
    vector<set<int>> setOperations(set<int> A, set<int> B) {
        set<int> uni, diff, inter;

        set_union(A.begin(), A.end(), B.begin(), B.end(),
                  inserter(uni, uni.begin()));

        set_difference(A.begin(), A.end(), B.begin(), B.end(),
                       inserter(diff, diff.begin()));

        set_intersection(A.begin(), A.end(), B.begin(), B.end(),
                         inserter(inter, inter.begin()));

        if (diff.empty()) diff.insert(0);
        if (inter.empty()) inter.insert(0);

        return {uni, diff, inter};
    }
};