class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for(int i = 0; i < nums.length; i++) {
            int secNum = target - nums[i];
            if(map.containsKey(secNum) && i != map.get(secNum)) {
                int[] ans = new int[2];
                ans[0] = i;
                ans[1] = map.get(secNum);
                return ans;
            }
        }
        return new int[2];
    }
}
