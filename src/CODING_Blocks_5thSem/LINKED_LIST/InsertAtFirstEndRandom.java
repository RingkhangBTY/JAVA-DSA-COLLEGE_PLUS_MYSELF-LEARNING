package CODING_Blocks_5thSem.LINKED_LIST;

import org.w3c.dom.events.EventException;

public class InsertAtFirstEndRandom {

    private Node head ;

    public static void main(String[] args) {
        InsertAtFirstEndRandom node = new InsertAtFirstEndRandom();

        node.insertEnd(10);
        node.insertEnd(13);
        node.insertEnd(132);
        node.insertEnd(1023);
        node.print();
        System.out.println();

        node.insertBeginning(9999);
        node.insertBeginning(67);
        node.print();
        System.out.println();

        node.insertRandom(909,0);
        node.insertRandom(908,3);
        node.print();
    }

    public void insertRandom(int data, int pos){
//        Node temp = head;
//        Node x = null;
//
//        for (int i = 1; i <pos-1 ; i++) {
//            temp = temp.next;
//        }
//
//        Node newNode = new Node(data);
//
//        x = temp.next;
//        temp.next = newNode;
//        newNode.next = x;

        if (pos < 0) throw new IndexOutOfBoundsException("Out of bounds for position: "+pos);


        if (head == null){
            if (pos == 0){
                insertBeginning(data);
            }else{
                System.out.println("List is empty");
            }
            return;
        }

        if (pos == 0){
            insertBeginning(data);
            return;
        }

        Node temp = head;

        for (int i = 1; i <pos ; i++) {
            if (temp.next == null){
                throw new IndexOutOfBoundsException("Out of bounds for position: "+pos);
            }

            temp = temp.next;
        }

        Node newNode = new Node(data);
        newNode.next = temp.next;
        temp.next=newNode;
    }

    public void insertEnd(int data) {
        if (head == null){
            head = new Node(data);
            return;
        }

        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }

        temp.next = new Node(data);
    }

    public void insertBeginning(int data) {

        if (head == null){
            head = new Node(data);
            return;
        }

        Node temp = head;

        head = new Node(data);
        head.next = temp;
    }

    public void print(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+"--> ");
            temp = temp.next;
        }
    }
}


