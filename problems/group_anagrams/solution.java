class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for(String s : strs){
            char[] sort_array = s.toCharArray();
            Arrays.sort(sort_array);
            String sorted_word = new String(sort_array);

            if(map.containsKey(sorted_word)) map.get(sorted_word).add(s);
            else{
                map.put(sorted_word, new ArrayList<>());
                map.get(sorted_word).add(s);
            }
        }

        return new ArrayList<>(map.values());
        
    }
}