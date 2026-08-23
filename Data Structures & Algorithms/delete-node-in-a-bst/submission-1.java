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
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root==null){
            return null;
        }

        if(root.val==key){
            if(root.right==null){
                return root.left;
            }
            else if(root.left==null){
                return root.right;
            }
            else{
                // Finding the inorder successor - smallest value in the right subtree
                TreeNode successor=root.right;

                while(successor.left!=null){
                    successor=successor.left;
                }
                
                // Replacing the node to be deleted with the inorder predecessor and deleting the actual inorder predecessor
                root.val=successor.val;
                root.right=deleteNode(root.right,successor.val);
            }
        }else{
            if(root.val> key){
                root.left=deleteNode(root.left,key);
            }else if(root.val<key){
                root.right=deleteNode(root.right,key);
            }
        }
        return root;
    }
}