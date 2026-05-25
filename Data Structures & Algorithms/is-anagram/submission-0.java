class Solution {
    public boolean isAnagram(String s, String t) {
        int arr1[]=new int[s.length()];
        int arr2[]=new int[t.length()];
        int temp1,temp2;

        for(int i=0;i<s.length();i++){
            arr1[i]=s.charAt(i);
        }
        for(int i=0;i<t.length();i++){
            arr2[i]=t.charAt(i);
        }
        
        for(int i=0;i<s.length()-1;i++){
            for(int j=0;j<s.length()-i-1;j++){
                if(arr1[j+1]<arr1[j]){
                    temp1=arr1[j];
                    arr1[j]=arr1[j+1];
                    arr1[j+1]=temp1;
                }
            }
        }

        for(int i=0;i<t.length()-1;i++){
            for(int j=0;j<t.length()-i-1;j++){
                if(arr2[j+1]<arr2[j]){
                    temp2=arr2[j];
                    arr2[j]=arr2[j+1];
                    arr2[j+1]=temp2;
                }
            }
        }

        return Arrays.equals(arr1,arr2);
    }
}
