class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length==1)
            return nums[0];
        HashMap<Integer, Integer> h=new HashMap<>();
        for(int i:nums){
            if(h.containsKey(i) && h.get(i)+1>nums.length/2)
                return i;
            else{
                h.put(i,h.getOrDefault(i,0)+1);
            }
        }
        return -1;
    }
}
