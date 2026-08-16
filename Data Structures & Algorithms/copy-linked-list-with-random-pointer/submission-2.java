/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null) {
            return null;
        }
        Node n1 = head;
        while(n1 != null) {
            Node n2 = new Node(n1.val);
            n2.next = n1.next;
            n1.next = n2;
            n1 = n2.next;
        }
        Node newHead = head.next;
        n1 = head;
        while(n1 != null) {
            if(n1.random != null) {
                n1.next.random = n1.random.next;
            }
            n1 = n1.next.next;
        }
        n1 = head;
        while(n1 != null) {
            Node n2 = n1.next;
            n1.next = n2.next;
            if(n2.next != null) {
                n2.next = n2.next.next;
            }
            n1 = n1.next;
        }
        return newHead;
    }
}
