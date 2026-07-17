class Solution {
    public int longestConsecutive(int[] nums) {
        int longSeq = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums) {
            set.add(num);
        }

        for(int num : nums) {
            int streak = 0;
            int currNum = num;
            while(set.contains(currNum)) {
                streak++;
                currNum++;
            }
            longSeq = Math.max(longSeq, streak);
        }
        return longSeq;
    }
}
