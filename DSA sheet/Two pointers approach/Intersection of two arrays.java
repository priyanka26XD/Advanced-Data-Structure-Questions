class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1=new HashSet<>();
        Set<Integer> set2=new HashSet<>();

        for(int nums:nums1){
            set1.add(nums);
        }
        for(int nums:nums2){
            set2.add(nums);
        }

        Set<Integer> intersection=new HashSet<>(set1);
        intersection.retainAll(set2);

        int result[]= new int[intersection.size()];
        int i=0;
        for(int num:intersection){
            result[i++]=num;
        }
        return result;
    }
}
