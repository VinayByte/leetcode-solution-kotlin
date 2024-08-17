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
 //https://leetcode.com/problems/binary-tree-right-side-view/description
class Solution {
    fun rightSideView(root: TreeNode?): List<Int> {
       val result = mutableListOf<Int>()
        rightSideViewUtils(root, 0, result)
        return result
    }
    
    fun rightSideViewUtils(node: TreeNode?, level: Int, list: MutableList<Int>){
        if(node == null) return
        if(list.getOrNull(level) == null){
            list.add(node.`val`)
        }
        rightSideViewUtils(node.right, level+1, list)
        rightSideViewUtils(node.left, level+1, list)
    }
}
