package linked_list;


public class Practice1{
    Node head;
    private int size;

    Practice1() {
        this.size = 0;
    }

    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }

    }
    
    
    // add first, last
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public void addlast(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currentNode=head;
        while(currentNode.next!=null){
            currentNode=currentNode.next;
        }
        currentNode.next=newNode;
        newNode.next=null;
    }
    ///printlist
    public void printlist(){
        if(head == null) {
            System.out.println("Head is null");
            return ;
        }
        Node currentNode=head;
        while(currentNode !=null){
            System.out.print(currentNode.data+" -> ");
            currentNode=currentNode.next;
        }
        System.out.println("Null");
    }
    // delete
    public void deleteFirst(){
        if(head==null){
            System.out.println("The list is empty");
            return;
        }
        size--;
        head=head.next;
    }
    public void deleteLast(){
        if(head==null){
            System.out.println("The list is empty");
            return;
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        Node last=head;
        Node secondLast=head;
        while(last.next!=null){
            secondLast=secondLast.next;
            last=last.next.next;
        }
        secondLast.next=null;
        
    }
    public int getSize(){
        return size;
    }
    public static void main(String[] args) {
        Practice1 list=new Practice1();
    }
}