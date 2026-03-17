package MY_PRACTICE.Exam;

public class Stack {
    private final int[] arr ;
    private int top = -1;

    public Stack(int size){
        arr = new int[size];
    }

    public void push(int element){
        if (top>=arr.length-1){
            System.out.println("Stack is full!....");
            return;
        }
        arr[++top] = element;
    }

    public int pop(){
        return arr[top--];
    }

    public int peak(){
        return arr[top];
    }
}
