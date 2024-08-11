/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    //time complexity:O(n+m), space: O(n+m)
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode {
        val resultNode: ListNode = ListNode(0)
        var currNode: ListNode = resultNode
        var carry = 0

        var node1 = l1
        var node2 = l2

        while (node1 != null || node2 != null) {
            val x = node1?.`val` ?: 0
            val y = node2?.`val` ?: 0
            var sum = carry + x + y

            carry = sum / 10
            sum = sum % 10
            currNode.next = ListNode(sum)
            currNode = currNode.next

            node1 = node1?.next
            node2 = node2?.next

        }
        if (carry > 0) currNode.next = ListNode(carry)
        return resultNode.next
    }
}
