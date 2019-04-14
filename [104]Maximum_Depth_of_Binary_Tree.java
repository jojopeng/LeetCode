/*
104. Maximum Depth of Binary Tree
Given a binary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

Note: A leaf is a node with no children.

Example:

Given binary tree [3,9,20,null,null,15,7],

    3
   / \
  9  20
    /  \
   15   7
return its depth = 3.
*/
/*

MaxHeight = 1 + max{MaxHeight of leftChildTree, MaxHeight of rightChildTree};

*/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 //递归
class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int leftDeep = maxDepth(root.left);
        int rightDeep = maxDepth(root.right);
        return Math.max(leftDeep,rightDeep) + 1;
    }
}

/*
javascript版本的BFS

*/
var maxDepth = function(root) {
    // iterative (BFS)
    var queue = [];
    queue.push(root);
    var cur = {};  // tree node, object
    var count = 0, size, i;
    if (root !== null && root !== undefined) {  // when root is null/undefined, return 0
        while (queue.length > 0) {
            // loop through all adjacent nodes of cur (binary tree, at most 2) --- from book
            // let's record the size of queue for now, and after looping through all same-level nodes, count++
            // this meets if there is only 1 root node as well
            size = queue.length;
            for (i = size; i > 0; i--) {
                // dequeue, get the head of the node in queue out(FIFO)
                cur = queue.shift();
                if (cur.left !== null && cur.left !== undefined) {
                    queue.push(cur.left);
                }
                if (cur.right !== null && cur.right !== undefined) {
                    queue.push(cur.right);
                }
            }
            count++;  // same-level nodes all looped, count++
        }
    }
    return count;
};
