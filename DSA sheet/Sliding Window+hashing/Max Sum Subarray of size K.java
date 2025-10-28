class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int n=arr.length;
        if(n<k || k<=0){
            return 0;
        }
        
        int windowSum=0;
        
        for(int i=0;i<k;i++){
            windowSum+=arr[i];
        }
        
        int maxSum=windowSum;
        
        for(int i=k;i<n;i++){
            windowSum=windowSum+arr[i]-arr[i-k];
            if(windowSum>maxSum){
                maxSum=windowSum;
            }
        }
        return maxSum;
    }
}
