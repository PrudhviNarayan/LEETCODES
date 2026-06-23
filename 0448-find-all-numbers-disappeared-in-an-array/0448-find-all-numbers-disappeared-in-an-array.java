class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);

        List<Integer> ans = new ArrayList<>();

        // Missing numbers before first element
        for (int i = 1; i < nums[0]; i++) {
            ans.add(i);
        }

        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] == nums[i + 1]) {
                continue; // ignore duplicates
            }

            for (int j = nums[i] + 1; j < nums[i + 1]; j++) {
                ans.add(j);
            }
        }

        // Missing numbers after last element
        for (int i = nums[nums.length - 1] + 1; i <= nums.length; i++) {
            ans.add(i);
        }

        return ans;
    }
}