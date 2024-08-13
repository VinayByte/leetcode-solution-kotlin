//https://leetcode.com/problems/reverse-linked-list-ii/description/
fun reverseBetween(head: ListNode?, left: Int, right: Int): ListNode? {
    // Edge case
    if (head == null || left == right) return head
    // Dummy node
    val dummy = ListNode(0)
    dummy.next = head

    var prev: ListNode? = dummy

    // Find node before left pos
    for (i in 1 until left) {
        prev = prev?.next
    }

    // Initialize a pointer to the node at the left position
    var curr: ListNode? = prev?.next

    for (i in left until right) {
        // Store the next node in the temp variable
        val temp = curr?.next
        // Reverse the next pointer of the current node
        curr?.next = temp?.next
        // Reverse the next pointer of the temp node
        temp?.next = prev?.next
        // Move the prev pointer to the temp node
        prev?.next = temp
    }
    return dummy.next
}
