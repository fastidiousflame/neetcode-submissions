class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        // for(int i:nums){
        //     if(!map.contiansKey(i)){
        //         map.put(i,0)
        //     }
        //     map.put(i,map.get(i)+1);
        // }
 
        // best way to calculate frequency
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }


        // Sorting by frequency
        List<Map.Entry<Integer,Integer>> list=new ArrayList<>(map.entrySet());
        list.sort((a,b)->b.getValue()-a.getValue());

        // Picking the first k elements
        int[] ans=new int[k];
        for(int i=0;i<k;i++){
            ans[i]=list.get(i).getKey();
        }

        return ans;

    }
}
