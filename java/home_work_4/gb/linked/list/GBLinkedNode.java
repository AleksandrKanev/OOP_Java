package home_work_4.gb.linked.list;

public class GBLinkedNode<T> {
    GBLinkedNode<T> next;
    GBLinkedNode<T> prev;
    T elem;
    public GBLinkedNode (GBLinkedNode<T> prev, T elem, GBLinkedNode<T> next){
        this.prev = prev;
        this.elem = elem;
        this.next = next;
    }
    public T getElem(){
        return elem;
    }

}
