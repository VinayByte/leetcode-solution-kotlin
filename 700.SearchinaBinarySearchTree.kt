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
//https://leetcode.com/problems/search-in-a-binary-search-tree/description/
class Solution {
    //recursive
    fun searchBST1(root: TreeNode?, `val`: Int): TreeNode? {
        if (root == null) return null
        if (root.`val` == `val`) return root

        if (`val` < root.`val`) return searchBST(root.left, `val`)

        return searchBST(root.right, `val`)
    }

    fun searchBST(root: TreeNode?, `val`: Int): TreeNode? {
        var current = root
        while (current != null) {
            when {
                current.`val` == `val` -> return current
                current.`val` < `val` -> current = current.right
                else -> current = current.left
            }
        }

        return null
    }
}
