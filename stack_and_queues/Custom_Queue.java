package stack_and_queues;

public class Custom_Queue {
        private int[] data;
        private static final int DEFAULT_SIZE =10;

        int end=0;

        public Custom_Queue(){
            this(DEFAULT_SIZE);
        }

        public Custom_Queue(int size){
            this.data=new int[size];
        }

        public boolean isFull() {
            return end == data.length; // prt is at the last index
        }
        private boolean isEmpty(){
            return end == 0; //ptr is at -1 i.e nothing is inserted 
        }

        public boolean push(int item){
            if(isFull()){
                return false;
            }
            data[end++]=item;
            return true;
        }

        public int remove() throws Exception{
            if(isEmpty()){
                throw new Exception("Queue is emty");
            }
            int removed=data[0];
            for(int i=1;i<end;i++){
                data[i-1]=data[i];
            }
            end--;
            return removed;
        }

        public int front() throws Exception{
            if(isEmpty()){
                throw new Exception("Queue is emty");
            }
            return data[0];
        }

        public void display(){
            for(int i=0;i<end;i++){
                System.out.println(data[i]+" < ");
            }
            System.out.println("END");
        }
}
