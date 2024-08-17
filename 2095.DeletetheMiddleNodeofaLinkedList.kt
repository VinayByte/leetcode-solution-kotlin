//https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/description
fun deleteMiddle(head: ListNode?): ListNode? {
    if(head?.next == null) return null
    val temp = ListNode(0)
    temp.next = head

    var slow: ListNode? = temp
    var fast: ListNode? = head

    while(fast?.next != null){
        slow = slow?.next
        fast = fast.next?.next
    }
    //delete
    slow?.next = slow?.next?.next

    return temp.next
}
