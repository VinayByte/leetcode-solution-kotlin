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
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        var result:ListNode = ListNode(0) // head
        // if(list1 == null) return list2
        // if(list2 == null) return list1
        var dummy:ListNode = result
        var l1 = list1
        var l2 = list2
        while(l1 != null && l2 != null){
            if(l1.`val` >= l2.`val`){
                dummy.next = l2
                l2 = l2.next
            } else {
                dummy.next = l1
                l1 = l1.next
            }
            dummy = dummy.next
        }
        if(l1 != null) dummy.next = l1
        if(l2 != null) dummy.next = l2

        return result.next
    }
}
