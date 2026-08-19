class Solution {
    public int majorityElement(int[] nums) {

        int max_num = nums[0];

        int max_count = 0;

        for(int num : nums){
            if(num == max_num){
                max_count++;
            }
            else if(num != max_num && max_count != 0){
                max_count--;
            }
            else{
                max_num = num;
                max_count++;
            }
        }

        return max_num;
        
    }
}