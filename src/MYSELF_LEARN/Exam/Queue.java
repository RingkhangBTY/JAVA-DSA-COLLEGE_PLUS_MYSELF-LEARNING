package MYSELF_LEARN.Exam;

class Queue {

    int size = 5;
    int[] queue = new int[size];

    int front = 0;
    int rear = -1;

    void enqueue(int value){
        if(rear == size-1){
            System.out.println("Queue Full");
            return;
        }
        queue[++rear] = value;
    }

    int dequeue(){
        if(front > rear){
            System.out.println("Queue Empty");
            return -1;
        }
        return queue[front++];
    }

    int peek(){
        if(front > rear) return -1;
        return queue[front];
    }
}