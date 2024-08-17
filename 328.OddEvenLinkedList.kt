//https://leetcode.com/problems/odd-even-linked-list/description/
fun oddEvenList(head: ListNode?): ListNode? {
    if (head == null) return null
    //maintain even & odd head
    val oddHead = head
    val evenHead = head.next

    var oddNode = oddHead
    var evenNode = evenHead

    while (evenNode?.next != null) {
        //Change Pointers for odd list
        oddNode?.next = oddNode?.next?.next
        oddNode = oddNode?.next

        //Change Pointers for even list
        evenNode.next = evenNode.next.next
        evenNode = evenNode.next
    }
    //assign even list at end of odd list
    oddNode?.next = evenHead
    return oddHead
}
