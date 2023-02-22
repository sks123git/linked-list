public class MyStack {
    public MyLinkedlist myLinkedlist;

    public MyStack(){
        this.myLinkedlist = new MyLinkedlist();
    }

    public void push(INode myNode){
        myLinkedlist.add(myNode);
    }
    public void pop(){
        myLinkedlist.pop();
    }
    public void display(){
        myLinkedlist.display();
    }

    public INode peak(){
        return myLinkedlist.head;
    }
}
