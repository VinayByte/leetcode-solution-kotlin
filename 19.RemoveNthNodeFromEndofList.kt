fun removeNthFromEnd(head: ListNode?, n: Int): ListNode {
    var dummy = ListNode(0)
    dummy.next = head

    var curr: ListNode? = dummy
    var prev: ListNode? = dummy
    for (i in 0 until n + 1) {
        curr = curr?.next
    }

    while (curr != null) {
        curr = curr.next
        prev = prev?.next
    }

    //remove the nth node from end
    prev?.next = prev?.next?.next
    return dummy.next
}
