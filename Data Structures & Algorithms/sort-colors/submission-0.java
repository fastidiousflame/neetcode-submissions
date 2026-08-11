class Solution {
    public void sortColors(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            for(int j=0;j<nums.length-i-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }

            }
        }
        System.out.print("[");
        for(int i=0;i<nums.length;i++){
            if(i==nums.length-1){
                System.out.print(nums[i]);
            }else{
                System.out.print(nums[i]+",");
            }
        }
        System.out.print("]");
    }
}