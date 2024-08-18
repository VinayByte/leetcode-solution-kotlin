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
//https://leetcode.com/problems/count-good-nodes-in-binary-tree/description
class Solution {
    var count = 0
    fun goodNodes(root: TreeNode?): Int {
        goodNodeCount(root, Int.MIN_VALUE)
        return count
    }

    fun goodNodeCount(node: TreeNode?, maxParent: Int){
        if(node == null) return

        val isGoodNode = node.`val` >= maxParent
        if(isGoodNode){
            count++
        }

        val currentMax = maxOf(maxParent, node.`val`)
        goodNodeCount(node.left, currentMax)
        goodNodeCount(node.right, currentMax)
    }
}
