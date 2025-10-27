class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer,Integer> remainderCounts=new HashMap<>();

        remainderCounts.put(0,1);

        int count=0;
        int currentSum=0;
        for(int num:nums){
            currentSum+=num;
            int remainder=currentSum%k;

            if(remainder<0){
                remainder+=k;
            }
            if(remainderCounts.containsKey(remainder)){
                count+=remainderCounts.get(remainder);
            }
            remainderCounts.put(remainder,remainderCounts.getOrDefault(remainder,0)+1);
        }
        return count;
    }
}
