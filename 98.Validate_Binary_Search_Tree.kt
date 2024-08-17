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
//https://leetcode.com/problems/validate-binary-search-tree/description/
class Solution {
    fun isValidBST(root: TreeNode?): Boolean {
        if (root == null) return true
        return isValidBST(root, null, null)
    }

    fun isValidBST(node: TreeNode?, min: Int?, max: Int?): Boolean {
        if (node == null) return true
        if (min != null && node.`val` <= min) return false
        if (max != null && node.`val` >= max) return false
        return isValidBST(node.left, min, node.`val`) && isValidBST(node.right, node.`val`, max)
    }
}
