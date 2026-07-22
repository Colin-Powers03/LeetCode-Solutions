class Solution {
    public int maxArea(int[] heights) {
        int maxArea = 0;
        int lp = 0;
        int rp = heights.length - 1;
        while(lp < rp) {
            int area = Math.min(heights[lp], heights[rp]) * (rp - lp);
            maxArea = Math.max(maxArea, area);
            if(heights[lp] <= heights[rp]) {
                lp++;
            }
            else {
                rp--;
            }
        }
        return maxArea;
    }
}
