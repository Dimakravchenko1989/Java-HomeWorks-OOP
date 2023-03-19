package HomeWork_4;

import HomeWork_4.gb.list.GBLinkedList;

public class Main {
    public static void main(String[] args) {
        GBLinkedList<Integer> gblist = new GBLinkedList<>();
        gblist.add(2)
                .add(3)
                .add(4)
                .add(5)
                .add(1,6); // ��������� ������� �� �������
        System.out.println(gblist);
        
        gblist.addFirst(1); // ���������� � ������ ������
        gblist.addLast(6); // ���������� � ����� ������
        System.out.println(gblist);

        gblist.remove(2); // �������� �������� �� ������ �� �������
        System.out.println(gblist);

        gblist.removeFirst(); // �������� ������� �������� ������
        System.out.println(gblist);

        gblist.removeLast(); // �������� ���������� �������� ������
        System.out.println(gblist);

        gblist.update(1, 10); // ������ �������� ������ �� �������
        System.out.println(gblist);

        System.out.println("������ ������: " + gblist.size());
        System.out.println("������� � �������� 0: " + gblist.get(0));
    }
}