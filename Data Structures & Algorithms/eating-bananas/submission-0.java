class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        return bs(piles,h);
    }

    public int maxEl(int[] arr){
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    public int func(int[] arr,int hourly){
        int total_hrs=0;
        for(int i=0;i<arr.length;i++){
            total_hrs+=Math.ceil((double)arr[i]/hourly);
        }
        return total_hrs;
    }
    public int bs(int[] arr,int h){
        int low=1;
        int high=maxEl(arr);
        int ans=0;
        int total_hrs;
        int mid;

        while(low<=high){
            mid=(high+low)/2;

            total_hrs=func(arr,mid);
            if(total_hrs<=h){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}
