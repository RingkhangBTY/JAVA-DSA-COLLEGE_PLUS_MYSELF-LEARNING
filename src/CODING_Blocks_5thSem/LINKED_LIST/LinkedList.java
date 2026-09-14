package CODING_Blocks_5thSem.LINKED_LIST;

public class LinkedList {
    public static void main(String[] args) {
        Node head = new Node(10);

        Node node1 = new Node(20);
        head.next = node1;

        Node node2 = new Node(30);
        node1.next = node2;

        Node node3 = new Node(30);
        node2.next = node3;

        Node node4 = new Node(30);
        node3.next = node4;

        Node node5 = new Node(30);
        node4.next = node5;

//        System.out.println(head.next.next.next.data);

        LinkedList obj = new LinkedList();
        obj.printList(head);
    }

    public void printList(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+"--> ");
            temp = temp.next;
        }
    }

}
