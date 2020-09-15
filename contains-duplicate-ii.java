class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> mapNums = new HashMap<>();
        // boolean isFound = false;        
    
        for (int i = 0; i < nums.length; i++){
            if (mapNums.containsKey(nums[i])){
                if (i - mapNums.get(nums[i]) <= k){
                    return true;
                }
            }
            mapNums.put(nums[i], i);            
        }    
        
        return false;
    }
}
