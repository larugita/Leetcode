class Solution {
    public String longestCommonPrefix(String[] strs) {

        int min_length = strs[0].length();

        for(String s : strs){
            if(s.length() < min_length){
                min_length = s.length();
            }
        }

        int i = 0;
        while(i < min_length){

            char c = strs[0].charAt(i);

            for(int j = 0; j < strs.length; j++){
                if(strs[j].charAt(i) != c){
                    return strs[j].substring(0,i);
                }
            }

            i++;
        }

        return strs[0].substring(0,min_length);
        
    }
}