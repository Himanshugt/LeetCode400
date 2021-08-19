// Problem Link: https://leetcode.com/problems/same-tree/

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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        solve(p,q);
	    return check;
    }
    
    void solve(TreeNode root1,TreeNode root2){
        
	    if(root1==null && root2==null){
	        return ;
	    }
	    else if(root1!=null && root2==null){
	        check=false;
	        return ;
	    }
	    else if(root1==null && root2!=null){
	        check=false;
	        return ;
	    }
	    
	    if(root1.val!=root2.val){
	        check=false;
	        return;
	    }
	    
	    solve(root1.left,root2.left);
	    solve(root1.right,root2.right);
	}
}