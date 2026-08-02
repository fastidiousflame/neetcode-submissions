class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        HashMap<Character,Integer> map=new HashMap<>();
        int x=0;
        for(char c:order.toCharArray()){
            map.put(c,x++);
        }

        for(int i=0;i<words.length-1;i++){
            int l = Math.min(words[i].length(), words[i + 1].length());

            boolean differentFound=false;
            for(int j=0;j<l;j++){
                char w1=words[i].charAt(j);
                char w2=words[i+1].charAt(j);

                if(w1==w2) continue;

                if (map.get(w1)>map.get(w2)){
                    return false;
                }

                else{
                    differentFound=true;
                    break;
                }
            }

            //Prefix Case
            if(!differentFound && words[i].length() > words[i+1].length()){
                return false;
            }
        }
        return true;

    }
}