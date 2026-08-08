class Solution {
    public int orangesRotting(int[][] grid) {

        // Using multisource BFS
        int m=grid.length;
        int n=grid[0].length;

        Queue<int[]> q=new LinkedList<>();

        // Push all the rotten oranges with time =0
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                    q.add(new int[]{i,j,0});
            }
           }
        }


        int ans=0;
        while(!q.isEmpty()){
            int[] curr=q.remove();

            int i=curr[0];
            int j=curr[1];
            int time=curr[2];

            ans=Math.max(ans,time);

            //Up
            if(i-1>=0 && grid[i-1][j]==1){
                grid[i-1][j]=2;
                q.add(new int[]{i-1,j,time+1});
            }

            // Right
            if (j+1<n && grid[i][j+1]==1) {
                grid[i][j+1]=2;
                q.add(new int[]{i,j+1,time+1});
            }

            // Down
            if (i+1<m && grid[i+1][j]==1) {
                grid[i+1][j]=2;
                q.add(new int[]{i+1,j,time+1});
            }

            // Left
            if (j-1>=0 && grid[i][j-1]==1) {
                grid[i][j-1]=2;
                q.add(new int[]{i,j-1,time+1});
            }
        }


        // Check if any fresh orange is left
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    return -1;
                }
            }
        }

        return ans;


    }

}

