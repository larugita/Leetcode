class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<List<Integer>, List<String>> map = new HashMap<>();

        for (String s : strs) {

            int[] count = new int[26];

            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }

            List<Integer> key = new ArrayList<>();

            for (int num : count) {     
                key.add(num);
            }

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(s);
        }

        return new ArrayList<>(map.values());
    }
}