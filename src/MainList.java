//Program for linked list
public class MainList {
    public static void main(String[] args) {
        NodeList firstValue = new NodeList(56);
        NodeList secondValue = new NodeList(30);
        NodeList thirdValue = new NodeList(70);
        MyLinkedlist myLinkedlist = new MyLinkedlist();
        MyStack myStack = new MyStack();
        myStack.push(firstValue);
        myStack.push(secondValue);
        myStack.push(thirdValue);
        myStack.display();
        INode peak =  myStack.peak();
        System.out.println(peak.getKey());
    }
}