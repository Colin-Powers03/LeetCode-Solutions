class Solution {
    public boolean isPalindrome(String s) {
        if(s.length() == 0) {
            return true;
        }
        String newStr = "";
        for(char ch : s.toCharArray()) {
            if(isASCII(ch)) {
                newStr = newStr + ch;
            }
        }
        int lp = 0;
        int rp = newStr.length() - 1;
        while(lp < rp) {
            if(Character.toLowerCase(newStr.charAt(lp)) != 
                Character.toLowerCase(newStr.charAt(rp))) {
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
