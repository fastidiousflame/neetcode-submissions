class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> s=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!s.contains(nums[i])){
                s.add(nums[i]);
            }
        }
        int max=0;
        int length=1;
        for(int num:s){
            //Starting only if num is the beginning
            if(!s.contains(num-1)){
                int curr=num;
                length=1;

                while(s.contains(curr+1)){
                    curr=curr+1;
                    length++;
                }
            }
            max = Math.max(max, length);
        }

        return max;

    }
}
