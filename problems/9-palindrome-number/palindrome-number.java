class Solution {
    public boolean isPalindrome(int x) {
        String num = Integer.toString(x);
        int i = num.length() - 1;
        int j = 0;

        while(num != ""){
            if(i < j){
                return true;
            }
            if(num.charAt(i) != num.charAt(j)){
                return false;
            }
            i--;
            j++;
        }

        return true;
        
    }
}