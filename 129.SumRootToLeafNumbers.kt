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
 //https://leetcode.com/problems/sum-root-to-leaf-numbers/description/
class Solution {
    fun sumNumbers(root: TreeNode?): Int {
        return dfs(root, 0)
    }

    fun dfs(node: TreeNode?, current: Int): Int{
        if(node == null) return 0
        val sum = current * 10 + node.`val`
        if(node.left == null && node.right == null){
            return sum
        } 
        val leftSum = dfs(node.left, sum)
        val rightSum = dfs(node.right, sum)
        return leftSum + rightSum
    }
}
