package home_work_4;

import home_work_4.gb.linked.list.GBLinkedList;

public class Main {
    public static void main(String[] args) {
//        LinkedList<Integer> list = new LinkedList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        for (int l: list) {
//            System.out.println(l);
//
//        }
//        System.out.println(list);
        GBLinkedList<Integer> list = new GBLinkedList<>();
        list.addLast(1);
        list.addLast(3);
        list.addLast(1);

        System.out.println(list.toString());
        list.getIndex(1);
        System.out.println(list.getSize());

    }
}
