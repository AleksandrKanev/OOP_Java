package home_work_4.gb.linked.list;

import home_work_4.gb.linked.GBList;

public class GBLinkedList<T> implements GBList<T> {

    private GBLinkedNode<T> head;
    private int size = 0;

    public int getSize() {
        return size;
    }


    @Override
    public String toString() {
        GBLinkedNode<T> temp = head;
        StringBuilder bilder = new StringBuilder();
        while (temp != null) {
            bilder.append(temp.elem).append(" ");
            temp = temp.next;
        }
        return bilder.toString();

    }

    @Override
    public void addFirst(T e) {

        if (head == null) {
            head = new GBLinkedNode<T>(null, e, null);
        } else {
            GBLinkedNode<T> temp = head;
            head = new GBLinkedNode<T>(null, e, temp);
        }
        size++;

    }

    @Override
    public void addLast(T e) {

        if (head == null) {
            head = new GBLinkedNode<T>(null, e, null);
        } else {
            GBLinkedNode<T> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new GBLinkedNode<T>(temp, e, null);
        }
        size++;
    }


    @Override
    public void getIndex(int index) {
        if(getSize()< index){
            System.out.println("Нет такого элемента");
        }else {
            GBLinkedNode<T> temp = head;
            int count = 0;
            while (count < index){
                temp = temp.next;
                count++;
            }
            System.out.println(temp.elem);
        }

    }
}


