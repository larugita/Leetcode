class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap <Integer, Integer> map = new HashMap<>();

        for(int i : nums){
            if(map.containsKey(i)){
                map.put(i, map.get(i) + 1);
            }
            else{
                map.put(i,1);
            }
        }
        for(int i : map.values()){
            if(i > 1){
                return true;
            }
        }

        return false;
    }
}