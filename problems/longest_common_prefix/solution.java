class Solution {
    public String longestCommonPrefix(String[] strs) {

        int min_length = strs[0].length();

        for(String s : strs){
            if(s.length() < min_length) min_length = s.length();
        }        

        int i = 0;

        while(i < min_length){
            char c = strs[0].charAt(i);
            for(String s : strs){
                if(s.charAt(i) != c) return s.substring(0,i);
            }
            i++;
        }

        return strs[0].substring(0, min_length);

    }
}