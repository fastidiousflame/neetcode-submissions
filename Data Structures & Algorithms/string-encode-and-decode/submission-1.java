class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb=new StringBuilder();

        for(String str:strs){
            sb.append(str.length());
            sb.append("#");
            sb.append(str);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {

        List<String> result=new ArrayList<>();
        String word="";

        for(int i=0;i<str.length();){
            // Find the '#'
            int j = i;
            while (str.charAt(j) != '#') {
                j++;
            }

             // Read the complete length (works for 1, 12, 123, ...)
            int x = Integer.parseInt(str.substring(i, j));
            
            for(int k=j+1;k<j+1+x;k++){
                word=word+str.charAt(k);
            }
            result.add(word);
            i=j+1+x;
            word="";
        }

        return result;
    }
}
