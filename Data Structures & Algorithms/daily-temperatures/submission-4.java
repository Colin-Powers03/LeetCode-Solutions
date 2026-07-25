class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] temps = new int[temperatures.length];
        for(int i = 0; i < temperatures.length; i++) {
            int streak = 1;
            int j = i + 1;
            while(j < temperatures.length) {
                if(temperatures[j] > temperatures[i]) {
                    break;
                }
                j++;
                streak++;
            }
            if(j == temperatures.length) {
                streak = 0;
            }
            temps[i] = streak;
        }
        return temps;
    }
}
