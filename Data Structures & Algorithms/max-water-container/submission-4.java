class Solution {
    public int maxArea(int[] heights) {
        int maxArea = 0;
        int lp = 0;
        int rp = heights.length - 1;
        while(lp < rp) {
            int tempArea = Math.min(heights[lp], heights[rp]) * (rp - lp);
            maxArea = Math.max(maxArea, tempArea);
            if(heights[lp] >= heights[rp]) {
                rp--;
            }
            else {
                lp++;
            }
        }
        return maxArea;
    }
}
