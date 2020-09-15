class Solution {
   public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1.length == 0 || nums2.length == 0)
            return new int[0];
        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int n : nums1)
            setA.add(n);
        
        for(int n : nums2) {
            if(setA.contains(n))
                setB.add(n);
        }

        int[] arr = new int[setB.size()];
        int count = 0;
        for(int n : setB) {
            arr[count] = n;
            count++;
        }
        return arr;     
    }
}
