class Solution {
    public String longestCommonPrefix(String[] strs) {
        int x=0;
        
        String s="";
        while(true){

            int c=0;

            // Check if first string has ended
            if (x >= strs[0].length())
                return s;

            for(int i=1;i<strs.length;i++){

                if (x >= strs[i].length())
                    return s;

                if(strs[i].charAt(x)==strs[0].charAt(x)){
                    c++;
                }
            }
            if(c==strs.length-1){
                s=s+strs[0].charAt(x);
                x++;
            }else{
                return s;
            }
            
        }
    }
}