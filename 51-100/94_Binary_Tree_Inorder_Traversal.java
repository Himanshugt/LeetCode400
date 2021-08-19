  
// Problem Link: https://leetcode.com/problems/binary-tree-inorder-traversal/

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
    
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> arr= new ArrayList<>();
        inOrderTrav(root,arr);
        return arr;
    }
    
    void inOrderTrav(TreeNode root,ArrayList<Integer> arr)
    {
        if(root==null)
        {
            return ;
        }
        inOrderTrav(root.left,arr);
        arr.add(root.val);
        inOrderTrav(root.right,arr);
    }
}