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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

        // if subRoot is null, every null tree is a subtrue so return true
        if(subRoot==null) return true;
        
        // if root is null, that means we ran out of nodes to compare with subroot
        if(root==null) return false;

        // sucess cond is when both tree and subtree are the same
        if(isSameTree(root, subRoot)) return true;

        // check for root's left and right
        return isSubtree(root.left,subRoot) || isSubtree(root.right, subRoot);
    }
    public boolean isSameTree(TreeNode root, TreeNode subRoot)
    {
        // if both root and subroot are null => theyre same
        if(root==null && subRoot==null) return true;

        // false cond, if either is null and values not equal
        if(root==null || subRoot==null || root.val!=subRoot.val) return false;

        return isSameTree(root.left, subRoot.left) && isSameTree(root.right,subRoot.right);
    }
}
