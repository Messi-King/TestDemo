//合并两个有序链表
public class TestDemo {
	public Node mergeTwoLists(Node headA, Node headB) {
        Node newHead = new Node(-1);
        Node tmp = newHead;
       
        while (headA != null && headB != null) {
            if (headA.data < headB.data) {
                tmp.next = headA;
                tmp = tmp.next;
                headA = headA.next;
            } else {
                tmp.next = headB;
                tmp = tmp.next;
                headB = headB.next;
            }
        }
        if (headA != null) {
            tmp.next = headA;
        } else {
            tmp.next = headB;
        }
        return newHead.next;
    }