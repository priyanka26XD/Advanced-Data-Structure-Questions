class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int totalLength=n+m;

        //Create merged array
        int[] merged=new int[totalLength];
        int i=0,j=0,k=0;
        while(i<n && j<m){
            if(nums1[i]<nums2[j]){
                merged[k++]=nums1[i++];
            }else{
                merged[k++]=nums2[j++];
            }
        }

        while(i<n){
            merged[k++]=nums1[i++];
        }
        while(j<m){
            merged[k++]=nums2[j++];
        }  

        //Find median  
        if(totalLength%2!=0){
            return (double)merged[totalLength/2];
        } else{
            int mid1=merged[totalLength/2-1];
            int mid2=merged[totalLength/2];
            return (double)(mid1+mid2)/2;
        }
    }
}
