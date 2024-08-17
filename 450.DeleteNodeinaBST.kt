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
//https://leetcode.com/problems/delete-node-in-a-bst/submissions/
class Solution {
    fun deleteNode(root: TreeNode?, key: Int): TreeNode? {
        if(root == null) return null
        when{
            key < root.`val` -> root.left = deleteNode(root.left, key)
            key > root.`val` -> root.right = deleteNode(root.right, key)
            else -> {
                // Case 1: Node with only one child or no child
                if(root.left == null) return root.right
                if(root.right == null) return root.left

                // Case 2: Node with two children -> Get the inorder successor (smallest in the right subtree) and assign to root.`val`
                root.`val` = minValue(root.right)
                root.right = deleteNode(root.right, root.`val`)
            }
        }
        return root
    }

    fun minValue(node: TreeNode?): Int{
        var current = node
        while(current?.left != null){
            current = current?.left
        }
        return current?.`val` ?: 0
    }
}
