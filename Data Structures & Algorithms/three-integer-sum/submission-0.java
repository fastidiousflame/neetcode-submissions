class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        List<List<Integer>> result=new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){
            
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }

            int l=i+1;
            int r=nums.length-1;


            while(l<r){
                sum=nums[i]+nums[l]+nums[r];
                if(sum<0){
                    l++;
                }else if(sum>0){
                    r--;
                }else{
                    List<Integer> triplet=new ArrayList<>();
                    triplet.add(nums[i]);
                    triplet.add(nums[l]);
                    triplet.add(nums[r]);

                    result.add(triplet);

                    while(l<r && nums[l]==nums[l+1]){
                        l++;
                    }
                    while(l<r && nums[r]==nums[r-1]){
                        r--;
                    }
                    l++;
                    r--;
                }
            }
        }
        return result;
    }
}
