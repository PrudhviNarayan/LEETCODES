import java.util.*;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        boolean[] seen = new boolean[n + 1];

        for (int x : nums) {
            seen[x] = true;
        }

        List<Integer> res = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (!seen[i]) {
                res.add(i);
            }
        }
        return res;
    }
}