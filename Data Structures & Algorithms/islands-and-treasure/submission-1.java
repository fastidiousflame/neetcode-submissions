class Solution {
    public void islandsAndTreasure(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;

        Queue<int[]> q=new LinkedList<>();

        //Put all treasures in a queue
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==0){
                    q.offer(new int[]{i,j});
                }
            }
        }

        int[][] directions={
            {1,0},{-1,0},{0,1},{0,-1}
        };

        while(!q.isEmpty()){
            int[] curr=q.poll();
            int r=curr[0];
            int c=curr[1];

            for(int[] dir:directions){
                int nr=r+dir[0];
                int nc=c+dir[1];

                // Outside grid
                if (nr < 0 || nr >= m || nc < 0 || nc >= n) {
                    continue;
                }

                // Wall/water
                if (grid[nr][nc] == -1) {
                    continue;
                }

                // Already visited
                if (grid[nr][nc] != Integer.MAX_VALUE) {
                    continue;
                }

                //Distance from current cell
                grid[nr][nc]=grid[r][c]+1;

                q.offer(new int[]{nr,nc});
            }
        }
    }
}
