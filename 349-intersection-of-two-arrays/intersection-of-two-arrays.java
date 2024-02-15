class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> integerList = new ArrayList<>();
        for(int i = 0;i<nums1.length;i++){
            for(int j = 0;j<nums2.length;j++){
               if (nums1[i] == nums2[j] && !integerList.contains(nums1[i])) {
                    integerList.add(nums1[i]);
                }  
            
            }
        }
        int[] result = new int[integerList.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = integerList.get(i);
        }
        return result;
    }
}