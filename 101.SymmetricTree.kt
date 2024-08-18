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
//https://leetcode.com/problems/symmetric-tree/description
class Solution {
    fun isSymmetric(root: TreeNode?): Boolean {
        return isSymetric(root?.left, root?.right)
    }

    fun isSymetric(leftNode: TreeNode?, rightNode: TreeNode?): Boolean{
        if(leftNode == null && rightNode == null) return true
        if(leftNode == null || rightNode == null) return false
        if(leftNode.`val` != rightNode.`val`) return false

        return isSymetric(leftNode.left, rightNode.right) && isSymetric(leftNode.right, rightNode.left)
    }
}
