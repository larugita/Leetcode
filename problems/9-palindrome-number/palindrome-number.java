class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false; // Negative numbers are not palindromes
        }
        
        String num = Integer.toString(x);
        int j = 0;
        int i = num.length() - 1;
        
        while (j < i) {
            if (num.charAt(j) != num.charAt(i)) {
                return false;
            }
            j++;
            i--;
        }
        
        return true;
    }
}
