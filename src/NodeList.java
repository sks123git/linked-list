public class NodeList<K> implements INode<K>{

    private K key;
    private INode<K> next;

    public NodeList(K key){
        this.key=key;
        this.next=null;
    }
@Override
    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    @Override
    public INode<K> getNext() {
        return next;
    }

    public void setNext(INode next) {
        this.next =(NodeList<K>) next;
    }
}
