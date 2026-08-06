class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> s1Count = new HashMap<>();
        for(char ch : s1.toCharArray()) {
            s1Count.put(ch, s1Count.getOrDefault(ch, 0) + 1);
        }
        int need = s1Count.size();
        for(int i = 0; i < s2.length(); i++) {
            HashMap<Character, Integer> s2Count = new HashMap<>();
            int curr = 0;
            for(int j = i; j < s2.length(); j++) {
                char ch = s2.charAt(j);
                s2Count.put(ch, s2Count.getOrDefault(ch, 0) + 1);
                if(s1Count.getOrDefault(ch, 0) < s2Count.getOrDefault(ch, 0)) {
                    break;
                }
                if(s1Count.getOrDefault(ch, 0) == s2Count.getOrDefault(ch, 0)) {
                    curr++;
                }
                if(curr == need) {
                    return true;
                }
            }
        }
        return false;
    }
}
