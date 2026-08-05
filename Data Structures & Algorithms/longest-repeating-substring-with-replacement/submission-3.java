class Solution {
    public int characterReplacement(String s, int k) {
        int ans=0;
        int left=0;
        int[] count = new int[26];
        int maxFreq=0;
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            count[ch - 'A']++;
            maxFreq = Math.max(maxFreq, count[ch - 'A']);
            
            int len=right-left+1;
            int replace=len-maxFreq;
            
            if(replace > k){
                count[s.charAt(left) - 'A']--;
                left++;
            } else {
                ans=Math.max(ans,len);
            }
        }
        return ans;
    }
}