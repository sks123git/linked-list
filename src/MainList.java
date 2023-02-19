//Program for linked list
public class MainList {
    public static void main(String[] args) {
        NodeList firstValue = new NodeList(56);
        NodeList secondValue = new NodeList(30);
        NodeList thirdValue = new NodeList(70);
        MyLinkedlist myLinkedlist = new MyLinkedlist();
        myLinkedlist.append(firstValue);
        myLinkedlist.append(secondValue);
        myLinkedlist.append(thirdValue);
        myLinkedlist.display();
        myLinkedlist.pop();
        myLinkedlist.pop();
        myLinkedlist.display();
    }
}