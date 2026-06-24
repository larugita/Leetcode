class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        HashMap <Character, Integer> map = new HashMap<>();

        char[] charS = s.toCharArray();
        for(char i : charS){
            if(map.containsKey(i)){
                map.put(i,map.get(i) + 1);
            }
            else{
                map.put(i,1);
            }
        }

        char[] charT = t.toCharArray();
        for(char i : charT){
            if(map.containsKey(i)){
                map.put(i, map.get(i) - 1);
            }
            else{
                return false;
            }
        }

        for(int i : map.values()){
            if(i != 0){
                return false;
            }
        }
        return true;
    }
}