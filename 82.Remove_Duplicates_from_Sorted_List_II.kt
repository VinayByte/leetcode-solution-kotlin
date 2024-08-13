fun deleteDuplicates(head: ListNode?): ListNode? {
    if (head?.next == null) return head

    val dummy = ListNode(0)
    dummy.next = head
    var prev: ListNode? = dummy
    var cur = head

    while (cur != null) {
        // Skip all nodes with the same value
        while (cur?.next != null && cur.next.`val` == cur.`val`) {
            cur = cur.next
        }

        // If no duplicates were found, move `prev` to `cur`
        if (prev?.next == cur) {
            prev = cur
        } else {
            // Skip duplicates
            prev?.next = cur?.next
        }
        // Move to the next node
        cur = cur?.next
    }
    return dummy.next
}
