class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length == 0) return 0;

        Arrays.sort(nums);

        int count = 1;

        int result = 1;

        for(int i = 0; i < nums.length-1; i++){
            int num = nums[i];
            if(nums[i+1] == num+1){
                count++;
            }
            else if(nums[i+1] == num){
                continue;
            }
            else{
                if(count > result) result = count;
                count = 1;
            }
            if(count > result) result = count;
        }

        return result;
        
    }
}