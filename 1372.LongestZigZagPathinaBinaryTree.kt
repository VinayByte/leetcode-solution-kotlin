/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
 //https://leetcode.com/problems/longest-zigzag-path-in-a-binary-tree/description
class Solution {
    var longestPath = 0
    fun longestZigZag(root: TreeNode?): Int {
        dfs(root, 0, 0)
        return longestPath
    }

    fun dfs(node: TreeNode?, leftLength: Int, rightLength: Int){
        if (node == null) {
            return
        }
        longestPath = maxOf(longestPath, maxOf(leftLength, rightLength))
        dfs(node.left, rightLength + 1, 0)
        dfs(node.right, 0, leftLength + 1)
    }
}
