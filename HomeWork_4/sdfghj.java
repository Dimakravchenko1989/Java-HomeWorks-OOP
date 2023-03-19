package HomeWork_4;

import HomeWork_4.gb.list.GBLinkedList;

public class Main {
    public static void main(String[] args) {
        GBLinkedList<Integer> gblist = new GBLinkedList<>();
        gblist.add(2)
                .add(3)
                .add(4)
                .add(5)
                .add(1,6); // добавляем элемент по индексу // 
        System.out.println(gblist);
        
        gblist.addFirst(1); // добавление в начало списка
        gblist.addLast(6); // добавление в конец списка
        System.out.println(gblist);

        gblist.remove(2); // удаление элемента из списка по индексу
        System.out.println(gblist);