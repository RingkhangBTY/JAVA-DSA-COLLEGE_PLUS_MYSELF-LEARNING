package MYSELF_LEARN.Exam;

public class StackQueueImpUsingArray {
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(20);
        stack.push(30);

        System.out.println(stack.pop());
//        System.out.println(stack.peak());


        // =================queue====================
        Queue queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}