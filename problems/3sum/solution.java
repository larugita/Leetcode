class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> result = new ArrayList<>();
        
        Arrays.sort(nums);
        // [-4, -1, -1, 0, 1, 2]

        for(int i = 0; i < nums.length; i++){
            int sum = 0 - nums[i];

            if(i > 0 && nums[i] == nums[i-1]){
                    continue;
                }

            int j = i+1;
            int k = nums.length-1;
            while(j < k){
                    if(nums[j] + nums[k] > sum){
                        k--;
                    }
                    else if(nums[j] + nums[k] < sum){
                        j++;
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