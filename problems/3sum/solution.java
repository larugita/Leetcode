class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();

        //[-4,-4,-1,-1,0,0,1,1,2,2]

        for(int i = 0; i < nums.length; i++){
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            int target = 0-nums[i];

            int j = i+1;
            int k = nums.length-1;

            while(j < k){
                if(nums[j] + nums[k] > target){
                    while(j < k && nums[j] + nums[k] > target){
                    k--;
                    }
                }
                else if(nums[j] + nums[k] < target){
                    while(j < k && nums[j] + nums[k] < target){
                        j++;
                    }
                }
                else{
                   List<Integer> triplet = new ArrayList<>();
                    triplet.add(nums[i]);
                    triplet.add(nums[j]);
                    triplet.add(nums[k]); 
                    result.add(triplet);
                    j++;
                    k--;
                    while(j < k && nums[j] == nums[j-1]){
                        j++;
                    }
                    while(j < k && nums[k] == nums[k+1]){
                        k--;
                    }
                }
            }
        }
        return result;
    }
}