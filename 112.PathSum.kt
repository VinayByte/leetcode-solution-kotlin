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
//https://leetcode.com/problems/path-sum/description
class Solution {
    fun hasPathSum(root: TreeNode?, targetSum: Int): Boolean {
        return dfs(root, 0, targetSum)
    }

    fun dfs(node: TreeNode?, sum: Int, targetSum: Int): Boolean {
        if (node == null) return false
        val currentSum = sum + node.`val`
        if (node.left == null && node.right == null) {
            return currentSum == targetSum
        }
        return dfs(node.left, currentSum, targetSum) || dfs(node.right, currentSum, targetSum)
    }

    fun hasPathSum1(root: TreeNode?, targetSum: Int): Boolean {
        if (root == null) return false
        if (root.left == null && root.right == null && root.`val` == targetSum) return true
        return hasPathSum(root.left, targetSum - root.`val`) || hasPathSum(root.right, targetSum - root.`val`)
    }
}

