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
//https://leetcode.com/problems/invert-binary-tree/description/
class Solution {
    fun invertTree(root: TreeNode?): TreeNode? {
        if(root == null) return null
        
        // Swap left,right child
        val temp = root.left
        root.left = root.right
        root.right = temp

        //recurssive
        invertTree(root.left)
        invertTree(root.right)
        return root
    }
}
