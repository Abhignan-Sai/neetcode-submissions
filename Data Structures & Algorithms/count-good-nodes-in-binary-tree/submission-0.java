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
    int count = 0;
    int maxSeen = Integer.MIN_VALUE;
    public int goodNodes(TreeNode root) {
        helper(root, maxSeen);
        return count;
    }
    public int helper(TreeNode root, int maxSeen)
    {
        // if we hit the leaves, we need to return 0 as the max
        if(root==null) return 0;

        // if curr node's val> maxSeen count++
        if(root.val>= maxSeen) count++;
        
        //update maxSeen
        maxSeen = Math.max(maxSeen, root.val);

        int leftCount = helper(root.left, maxSeen);
        int rightCount = helper(root.right, maxSeen);

        return count+leftCount+rightCount;


    }
}
