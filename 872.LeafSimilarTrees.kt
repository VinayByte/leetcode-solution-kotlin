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
//https://leetcode.com/problems/leaf-similar-trees/description
class Solution {
    fun leafSimilar(root1: TreeNode?, root2: TreeNode?): Boolean {
        val leaf1 = mutableListOf<Int>()
        val leaf2 = mutableListOf<Int>()
        dfs(root1, leaf1)
        dfs(root2, leaf2)

        return leaf1 == leaf2
    }
    fun dfs(node: TreeNode?, leaf: MutableList<Int>){
        if(node == null) return
        if(node.left == null && node.right == null){
            leaf.add(node.`val`)
        }
        dfs(node.left, leaf)
        dfs(node.right, leaf)
    }
}
