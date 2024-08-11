
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
    //Solution using Floyd's Cycle Algorithm or Tortoise And Hare algorithm
    //time complexity:O(n), space: O(1)
    fun hasCycle(head: ListNode?): Boolean {
        var slow: ListNode? = head
        var fast: ListNode? = head
        while (slow != null && fast?.next != null) {
            slow = slow.next
            fast = fast.next.next
            if (slow == fast) {
                return true
            }
        }
        return false
    }
}
