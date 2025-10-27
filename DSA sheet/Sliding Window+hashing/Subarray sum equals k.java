class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> prefixSumCounts=new HashMap<>();
        prefixSumCounts.put(0,1);

        int count=0;
        int currentSum=0;
        for(int num:nums){
            currentSum+=num;

            int complement=currentSum-k;
            if(prefixSumCounts.containsKey(complement)){
                count+=prefixSumCounts.get(complement);
            }
            prefixSumCounts.put(currentSum,prefixSumCounts.getOrDefault(currentSum,0)+1);
        }
        return count;
    }
}
