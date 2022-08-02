fun main() {

    val linkedList= ListNode(2)

    linkedList.next = ListNode(4)
    linkedList.next!!.next = ListNode(7)
    linkedList.next!!.next!!.next = ListNode(5)
    linkedList.next!!.next!!.next!!.next = ListNode(17)

    println(middleNode(linkedList)!!.`val`)
}

fun middleNode(head: ListNode?): ListNode? {
    var fast = head
    var slow = head

    while (fast?.next != null) {
        slow = slow?.next
        fast = fast.next!!.next
    }

    return slow
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}