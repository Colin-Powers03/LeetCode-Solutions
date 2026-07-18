class Solution {
    public int[] twoSum(int[] numbers, int target) {
        for(int i = 0; i < numbers.length; i++) {
            for(int j = 0; j < numbers.length; j++) {
                if(numbers[i] + numbers[j] == target && i != j) {
                    int[] ans = new int[2];
                    ans[0] = i + 1;
                    ans[1] = j + 1;
                    return ans;
                }
            }
        }
        return new int[2];
    }
}
