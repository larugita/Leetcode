class Solution {
    public int longestConsecutive(int[] nums) {

        int result = 0;

        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }

        for(int num : set){
            if(set.contains(num - 1)){
                continue;
            }

            int count = 1;

            while(set.contains(num+1)){
                count++;
                num++;
            }

            if(result < count) result = count;
        }

        return result;
        
    }
}