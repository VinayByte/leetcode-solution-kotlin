/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
 //https://leetcode.com/problems/maximum-twin-sum-of-a-linked-list/description
class Solution {
    fun pairSum(head: ListNode?): Int {
        if(head == null) return 0

        //1. find middle of linked list
        val mid = getMiddle(head)
        var left = head
        var right = reverseLinkedList(mid?.next)

        var maxTwinSum = Int.MIN_VALUE
        // Step 2: Compare the first half (left) with the reversed second half(right)
        var secondHalfPointer = right
        while (secondHalfPointer != null){
            maxTwinSum = maxOf(maxTwinSum, (left!!.`val` + secondHalfPointer.`val`))
            left = left.next
            secondHalfPointer = secondHalfPointer.next
        }
        return maxTwinSum
    }

    fun getMiddle(head: ListNode?): ListNode?{
        var slow = head
        var fast = head
        while(fast?.next != null && fast.next?.next != null){
            slow = slow?.next
            fast = fast.next?.next
        }
        return slow
    }

    fun reverseLinkedList(head: ListNode?): ListNode?{
        var prev: ListNode? = null
        var current = head
        while(current != null){
            val temp = current.next
            current.next = prev
            prev = current
            current = temp
        }
        return prev
    }
}
