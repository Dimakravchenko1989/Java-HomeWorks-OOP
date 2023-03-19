package HomeWork_4;

import HomeWork_4.gb.list.GBLinkedList;

public class Main {
    public static void main(String[] args) {
        GBLinkedList<Integer> gblist = new GBLinkedList<>();
        gblist.add(2)
                .add(3)
                .add(4)
                .add(5)
                .add(1,6); // добавляем элемент по индексу
        System.out.println(gblist);
        
        gblist.addFirst(1); // добавление в начало списка
        gblist.addLast(6); // добавление в конец списка
        System.out.println(gblist);

        gblist.remove(2); // удаление элемента из списка по индексу
        System.out.println(gblist);

        gblist.removeFirst(); // удаление первого элемента списка
        System.out.println(gblist);

        gblist.removeLast(); // удаление последнего элемента списка
        System.out.println(gblist);

        gblist.update(1, 10); // замена элемента списка по индексу
        System.out.println(gblist);

        System.out.println("Размер списка: " + gblist.size());
        System.out.println("Элемент с индексом 0: " + gblist.get(0));
    }
}