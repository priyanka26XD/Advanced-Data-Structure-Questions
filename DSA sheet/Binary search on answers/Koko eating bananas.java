class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        long left=1;
        long right=0;

        for(int pile:piles){
            if(pile>right){
                right=pile;
            }
        }

        long minK=right;

        while(left<=right){
            long mid=left+(right-left)/2;

            if(canFinish(piles,h,mid)){
                minK=mid;
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return (int)minK;
    }

    public boolean canFinish(int[] piles, int h, long k){
        long totalTime=0;

        for(int pileSize:piles){
            totalTime+=(pileSize+k-1)/k;
            if(totalTime>h){
                return false;
            }
        }
        return totalTime<=h;
    }
}
