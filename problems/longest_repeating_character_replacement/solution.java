class Solution {
    public int characterReplacement(String s, int k) {

        int result = 0;

        HashMap<Character, Integer> count = new HashMap<>();

        int left = 0;

        for(int right = 0; right < s.length(); right++){
            if(!count.containsKey(s.charAt(right))){
                count.put(s.charAt(right), 1);
            }
            else{
                count.put(s.charAt(right), count.get(s.charAt(right)) + 1);
            }

            int maxfreq = 0;

            for(int freq : count.values()){
                maxfreq = Math.max(maxfreq, freq);
            }

            while((right - left + 1) - maxfreq > k){
                count.put(s.charAt(left), count.get(s.charAt(left)) - 1);
                left++;
            }
            result = Math.max(result, right - left + 1);
        }

        return result;
        
    }
}