class Solution {
    public boolean isPalindrome(String s) {
        if(s.length() == 0) {
            return true;
        }
        int lp = 0;
        int rp = s.length() - 1;
        while(lp < rp) {
            while(lp < rp && !isASCII(s.charAt(lp))) {
                lp++;
            }
            while(rp > lp && !isASCII(s.charAt(rp))) {
                rp--;
            }
            if(Character.toLowerCase(s.charAt(lp)) != 
                Character.toLowerCase(s.charAt(rp))) {
                return false;
            }
            lp++;
            rp--;
        }
        return true;
    }

    private boolean isASCII(char ch) {
        if(ch >= 'a' && ch <= 'z' ||
           ch >= 'A' && ch <= 'Z' ||
           ch >= '0' && ch <= '9') {
            return true;
        }
        return false;
    }
}
