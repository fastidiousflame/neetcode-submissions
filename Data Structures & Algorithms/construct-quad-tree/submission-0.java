/*
// Definition for a QuadTree node.
class Node {
    public boolean val;
    public boolean isLeaf;
    public Node topLeft;
    public Node topRight;
    public Node bottomLeft;
    public Node bottomRight;

    
    public Node() {
        this.val = false;
        this.isLeaf = false;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }
    
    public Node(boolean val, boolean isLeaf) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }
    
    public Node(boolean val, boolean isLeaf, Node topLeft, Node topRight, Node bottomLeft, Node bottomRight) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = topLeft;
        this.topRight = topRight;
        this.bottomLeft = bottomLeft;
        this.bottomRight = bottomRight;
    }
}
*/

class Solution {
    public Node construct(int[][] grid) {
        return helper(grid,0,0,grid.length);
    }
    public Node helper(int[][] grid,int r,int c,int n){
        //Checking if entire region has the same value

        boolean same=true;
        for(int i=r;i<r+n;i++){
            for(int j=c;j<c+n;j++){
                if(grid[i][j]!=grid[r][c]){
                    same=false;
                    break;
                }
            }
            if(!same) break;
        }
        // If all the values are same make a leaf
        if(same){
            return new Node(grid[r][c]==1,true);
        }

        else{
            Node root=new Node(true,false);

            root.topLeft=helper(grid,r,c,n/2);
            root.topRight=helper(grid,r,c+n/2,n/2);
            root.bottomLeft=helper(grid,r+n/2,c,n/2);
            root.bottomRight=helper(grid,r+n/2,c+n/2,n/2);

            return root;
        }
    }
}














