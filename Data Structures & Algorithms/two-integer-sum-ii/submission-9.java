class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int lp = 0;
        int rp = numbers.length - 1;
        while(lp < rp) {
            if(numbers[lp] + numbers[rp] < target) {
                lp++;
            }
            else if(numbers[lp] + numbers[rp] > target) {
                rp--;
            }
            else {
                int[] ans = new int[2];
                ans[0] = lp + 1;
                ans[1] = rp + 1;
                return ans;
            }
        }
        return new int[2];
    }
}
