// Problem Link: https://leetcode.com/problems/symmetric-tree/

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
    boolean check=true;
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        else{
            mirror(root.left,root.right);
            return check;
        }
    }
    
    void mirror(TreeNode node1,TreeNode node2){
        if(node1==null && node2==null)
        {
            return;
        }
        else if(node1!=null && node2==null)
        {
            check=false;
            return;
        }
        else if(node1==null && node2!=null)
        {
            check=false;
            return ;
        }
        else
        {
            if(node1.val!=node2.val)
            {
                check=false;
                return ;
            }
            else
            {
                mirror(node1.left,node2.right);
                mirror(node1.right,node2.left);
            }

        }
    }
}