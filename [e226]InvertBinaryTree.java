#226. Invert Binary Tree
#Example:

#Input:

#     4
#   /   \
#  2     7
# / \   / \
#1   3 6   9
#Output:

#     4
#   /   \
#  7     2
# / \   / \
#9   6 3   1

#recursive
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return null;
        }
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;
        
    }
}
