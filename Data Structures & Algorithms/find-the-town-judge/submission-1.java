class Solution {
    public int findJudge(int n, int[][] trust) {
        // indegree:- no of people who trust person i
        int[] indegree=new int[n+1];

        //outdegree:- no of people the person i trusts
        int[] outdegree=new int[n+1];

        // Processing every trust relationship
        for(int i=0;i<trust.length;i++){
            int a=trust[i][0];
            int b=trust[i][1];

            //a trusts someone
            outdegree[a]++;

            //b is trusted by someone
            indegree[b]++;
        }

        for(int i=1;i<=n;i++){
            // Judge trusts no one and judge is trusted by every one
            if(outdegree[i]==0 & indegree[i]==n-1){
                return i;
            }
        }

        return -1;
    }
}