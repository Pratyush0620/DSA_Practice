package stack_and_queues;

public class CircularQueue {
        protected int[] data;
        private static final int DEFAULT_SIZE =10;

        protected int end=0;
        protected int front=0;
        private int size=0;

        public CircularQueue(){
            this(DEFAULT_SIZE);
        }

        public CircularQueue(int size){
            this.data=new int[size];
        }

        public boolean isFull() {
            return size == data.length; // prt is at the last index
        }
        private boolean isEmpty(){
            return size == 0; //ptr is at -1 i.e nothing is inserted 
        }

        public boolean insert(int item){
            if(isFull()){
                System.out.println("Queue is full...");
                return false;
            }
            data[end++]=item;
            end = end % data.length;
            size++;
            return true;
        }

        public int remove() throws Exception{
            if(isEmpty()){
                throw new Exception("Queue is emty");
            }
            int removed=data[front++];
            front=front % data.length;
            size--;
            return removed;
        }

        public int front() throws Exception{
            if(isEmpty()){
                throw new Exception("Queue is emty");
            }
            return data[front];
        }

        public void display(){
            if(isEmpty()){
                System.out.println("Queue is empty.");
                return ;
            }
            int i=front;
            do { 
                System.out.print(data[i]+" -> ");
                i++;
                i=i%data.length;
            } while (i!=end);
            System.out.print("End");
            System.out.println();
        }
}
