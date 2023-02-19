import java.util.Scanner;

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
    public void popLast(){
        INode temp=head;
        while (temp.getNext().getNext()!=null){
            this.tail=temp.getNext();
            this.tail.setNext(null);
            temp=temp.getNext();
        }
    }
    public void search(INode key){
        INode temp=head;
        int i=0;
        while (temp.getNext()!=null){
            if(key.getKey()==temp.getKey()){
                System.out.println("key found at index "+(i+1));
                return;
            }i++;
            temp=temp.getNext();
        }
    }

    public void insertElementInBetween(INode newNode, INode prevNode){
        INode temp = head;
        while (temp!=null){
            if(temp.getKey()==prevNode.getKey()){
                newNode.setNext(temp.getNext());
                temp.setNext(newNode);
                return;
            }
            temp=temp.getNext();
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
