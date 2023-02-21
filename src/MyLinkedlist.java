import java.util.WeakHashMap;

public class MyLinkedlist<K extends Comparable<K>> {
    INode head = null;
    INode tail = null;

    public void MyLinkedList(INode head, INode tail) {
        this.head = head;
        this.tail = tail;
    }

    public void add(INode newNode) {
        if (this.head == null) {
            this.head = newNode;
        }
        if (this.tail == null) {
            this.tail = newNode;
        } else {
            INode tempNode = head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
    }

    public void append(INode newNode) {
        if (this.head == null) {
            this.head = newNode;
        }
        if (this.tail == null) {
            this.tail = newNode;
        } else {
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
    }

    public void pop() {
        if (this.head == null) {
            return;
        }
        if (this.head.getNext() == null) {
            this.head = null;
        } else {
            this.head = head.getNext();
        }
    }

    public void popLast() {
        INode temp = head;
        while (temp.getNext().getNext() != null) {
            this.tail = temp.getNext();
            this.tail.setNext(null);
            temp = temp.getNext();
        }
    }

    public void search(INode key) {
        INode temp = head;
        int i = 0;
        while (temp.getNext() != null) {
            if (key.getKey() == temp.getKey()) {
                System.out.println("key found at index " + (i + 1));
                return;
            }
            i++;
            temp = temp.getNext();
        }
    }

    public int count() {
        INode temp = head;
        int i = 0;
        while (temp != null) {
            i++;
            temp = temp.getNext();
        }
        return i;
    }

    public void insertElementInBetween(INode newNode, INode prevNode) {
        INode temp = head;
        while (temp != null) {
            if (temp.getKey() == prevNode.getKey()) {
                newNode.setNext(temp.getNext());
                temp.setNext(newNode);
                return;
            }
            temp = temp.getNext();
        }
    }

    public void deleteInBetween(INode key) {
        INode temp = head, prev = null;
        if (temp != null && temp.getKey() == key) {
            head = temp.getNext();
            return;
        }
        while (temp != null && temp.getKey() != key) {
            prev = temp;
            temp = temp.getNext();
        }

        if (temp == null) {
            return;
        }

        prev.setNext(temp.getNext());

    }

    public void display() {
        INode temp = head;
        if (temp == null) {
            System.out.println("list is empty");
            return;
        }
        System.out.println("Elements are: ");
        while (temp != null) {
            System.out.print(" " + temp.getKey());
            temp = temp.getNext();
        }
        System.out.println();
    }

    public <K extends Comparable<K>> void sort() {
        INode<K> temp = (INode<K>) head,index = null;

        if (temp == null) {
            System.out.println("list is empty");
            return;
        }

        while (temp != null) {
            index = temp.getNext();
            while (index != null) {
                if ((temp.getKey().compareTo(index.getKey()) > 0)) {
                    K temp2 = temp.getKey();
                    temp.setKey(index.getKey());
                    index.setKey(temp2);
                }
                index = index.getNext();
            }
            temp = temp.getNext();
        }
    }
}

