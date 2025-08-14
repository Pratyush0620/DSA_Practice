package stack_and_queues;

public class Main {
    public static void main(String[] args) throws Exception{
        // CustomStack stack=new CustomStack(5);
        // stack.push(18);
        // stack.push(134);
        // stack.push(90);
        // stack.push(78);
        // stack.push(34);
        
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());

        CircularQueue q=new CircularQueue(5);
        q.insert(3);        
        q.insert(6);
        q.insert(5);
        q.insert(19);
        q.insert(1);

        q.display();
        q.insert(12);

    }
}
