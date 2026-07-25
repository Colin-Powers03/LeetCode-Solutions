class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] temps = new int[temperatures.length];
        Stack<int[]> stack = new Stack<>(); // [temp, index]
        for(int i = 0; i < temperatures.length; i++) {
            while(!stack.isEmpty() && temperatures[i] > stack.peek()[0]) {
                int[] pair = stack.pop();
                temps[pair[1]] = i - pair[1];
            }
            stack.push(new int[]{temperatures[i], i});
        }
        return temps;
    }
}
