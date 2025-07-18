import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(nums, 0, new ArrayList<Integer>(), ans);
        return ans;

    }

    void backtrack(int[] nums, int idx, List<Integer> current, List<List<Integer>> ans) {
        if (idx == nums.length) {
            ans.add(new ArrayList<Integer>(current));
            return;
        }
        backtrack(nums, idx + 1, current, ans);
        current.add(nums[idx]);
        backtrack(nums, idx + 1, current, ans);
        current.remove(current.size() - 1);
    }
}
