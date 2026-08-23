/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> a=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();

        if(root==null){
            return a;
        }

        q.add(root);

        while(!q.isEmpty()){
            int n=q.size();

            for(int i=0;i<n;i++){

                TreeNode x=q.remove();

                //Last node of this level
                if(i==n-1){
                    a.add(x.val);
                }

                if(x.left!=null){
                    q.add(x.left);
                }

                if(x.right!=null){
                    q.add(x.right);
                }
            }
        }
            return a;
    }

}
