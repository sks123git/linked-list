public class MyLinkedlist {
    INode head = null;
    INode tail = null;

    public void MyLinkedList(INode head,INode tail){
        this.head=head;
        this.tail=tail;
    }
    public void add(INode newNode){
        if(this.head==null){
            this.head=newNode;
        }
        if(this.tail==null){
            this.tail=newNode;
        } else {
            INode tempNode=head;
            this.head=newNode;
            this.head.setNext(tempNode);
        }
    }
    public void append(INode newNode){
        if(this.head==null){
            this.head=newNode;
        }
        if(this.tail==null){
            this.tail=newNode;
        } else {
            this.tail.setNext(newNode);
            this.tail=newNode;
        }
    }
    public void pop() {
        if (this.head == null) {
            return;
        }
        if (this.head.getNext() == null) {
            this.head=null;
        } else {
            this.head = head.getNext();
        }
    }
    public void display(){
        INode temp = head;
        if (temp==null){
            System.out.println("list is empty");
            return;
        }
        System.out.println("Elements are: ");
        while (temp!=null){
            System.out.print(" "+temp.getKey());
            temp=temp.getNext();
        }
        System.out.println();
    }
}
