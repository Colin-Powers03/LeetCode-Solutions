class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod = 1;
        int zeroCount = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                prod *= nums[i];
            }
            else {
                zeroCount++;
            }
        }
        if(zeroCount >= 2) {
            return new int[nums.length];
        }
        int[] ans = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            if(zeroCount > 0) {
                if(nums[i] == 0) {
                    ans[i] = prod;
                }
                else {
                    ans[i] = 0;
                }
            }
            else {
                ans[i] = prod / nums[i];
            }
        }
        return ans;
    }
}  
