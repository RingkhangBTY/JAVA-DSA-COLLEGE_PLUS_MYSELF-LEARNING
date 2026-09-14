package CODING_Blocks_5thSem.LINKED_LIST;

public class NodeProblem1 {
    public static void main(String[] args) {
        int []nums = {10,20,30,40,50,60};

        Node head = new Node(nums[0]);
        Node temp = head;

        for (int i = 1; i < nums.length; i++) {
            Node newNode = new Node(nums[i]);

            temp.next = newNode;
            temp = newNode;

//            temp = temp.next;
        }

        LinkedList obj = new LinkedList();
        obj.printList(head);
    }
}
