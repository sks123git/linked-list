public class MyLinkedlist {
    INode head = null;
    INode tail = null;

    public void MyLinkedList(INode head,INode tail){
        this.head=head;
        this.tail=head;
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
    public void display(){
        INode temp = head;
        System.out.println("Elements are: ");
        while (temp!=null){
            System.out.print(" "+temp.getKey());
            temp=temp.getNext();
        }
    }
}
