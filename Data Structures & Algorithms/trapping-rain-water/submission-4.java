class Solution {
    public int trap(int[] height) {
        if(height == null || height.length == 0) {
            return 0;
        }
        int lp = 0;
        int rp = height.length - 1;
        int leftMax = height[lp];
        int rightMax = height[rp];
        int trappedWater = 0;
        while(lp < rp) {
            if(leftMax < rightMax) {
                lp++;
                leftMax = Math.max(leftMax, height[lp]);
                trappedWater += leftMax - height[lp];
            }
            else {
                rp--;
                rightMax = Math.max(rightMax, height[rp]);
                trappedWater += rightMax - height[rp];
            }
        }
        return trappedWater;
    }
}
