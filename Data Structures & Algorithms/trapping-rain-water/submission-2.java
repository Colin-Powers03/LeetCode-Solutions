class Solution {
    public int trap(int[] height) {
        if(height == null || height.length == 0) {
            return 0;
        }
        int trappedWater = 0;
        int len = height.length;

        for(int i = 0; i < len; i++) {
            int leftMax = height[i];
            int rightMax = height[i];
            for(int j = 0; j < i; j++) {
                leftMax = Math.max(leftMax, height[j]);
            }
            for(int j = i; j < len; j++) {
                rightMax = Math.max(rightMax, height[j]);
            }
            trappedWater += Math.min(leftMax, rightMax) - height[i];
        }
        return trappedWater;
    }
}
