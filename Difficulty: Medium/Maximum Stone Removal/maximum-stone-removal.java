class Solution {
    int[] parent;
    int find(int x){
        if(parent[x] == x) return x;
        return parent[x] = find(parent[x]);
    }
    void union(int a, int b){
        a = find(a);
        b = find(b);
        if(a!=b) parent[b] = a;
    }
    int maxRemove(int[][] stones) {
        // Code here
        int n = stones.length;
        parent = new int[20005];
        for(int i = 0; i < 20005; i++) parent[i] = i;
        for(int[] s:stones){
            union(s[0], s[1] + 10000);
        }
        java.util.HashSet<Integer> set = new java.util.HashSet<>();
        for(int[] s:stones){
            set.add(find(s[0]));
        }
        return n - set.size();
        
    }
};
