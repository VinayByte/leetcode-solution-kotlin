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
 //https://leetcode.com/problems/maximum-level-sum-of-a-binary-tree/description
class Solution {
    fun maxLevelSum(root: TreeNode?): Int {
        var maxSum = Int.MIN_VALUE
        var maxLevel = 0
        var level = 0
        val queue: Queue<TreeNode> = LinkedList<TreeNode>()
        queue.add(root)

        while(queue.isNotEmpty()){
            val levelSize = queue.size
            var currentSum = 0
            for(i in 0 until levelSize){
                val node = queue.poll()
                currentSum += node?.`val` ?: 0
                node?.left?.let {
                    queue.add(it) 
                }
                node?.right?.let {
                    queue.add(it) 
                }
            } 
            level++
            if(currentSum > maxSum){
                maxSum = currentSum
                maxLevel = level
            }
        }
        return maxLevel
    }
}
