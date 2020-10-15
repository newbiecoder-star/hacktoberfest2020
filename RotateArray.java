class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int[] ans = new int[nums.length];
        for (int i = 0; i < k; i++) {
            ans[i] = nums[nums.length - k + i];
        }
        for(int i = k; i < nums.length; i ++){
            ans[i] = nums[i-k];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = ans[i];
        }
    }
}
