class Solution {
    public int removeElement(int[] nums, int val) {
        int index=0;// Pointer for the next valid element position
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[index]=nums[i];
                index++;
            }
        }
        return index;//return the count of elements that do not equal val
    }
}