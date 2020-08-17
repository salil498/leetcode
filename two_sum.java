public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0; i < numbers.length; i ++) {
            if(map.get(target - numbers[i]) != null) {
                return new int[]{map.get(target - numbers[i]),i};
            }
            map.put(numbers[i], i);
        }
        return null;
    }
}
