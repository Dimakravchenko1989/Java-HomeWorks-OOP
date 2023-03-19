package HomeWork_4;

import HomeWork_4.gb.list.GBLinkedList;


public class Main {
    public static void main(String[] args) {
        GBLinkedList<Integer> gblist = new GBLinkedList<>();
        gblist.add(2)
                .add(3)
                .add(4)
                .add(5)
                .add(1,6); // ралвтссььщв лвомшвомшво вощввсшвщылвс ывсытвсты
        System.out.println(gblist);
        
        gblist.addFirst(1); // РґРѕР±Р°РІР»РµРЅРёРµ РІ РЅР°С‡Р°Р»Рѕ СРїРёСРєР°
        gblist.addLast(6); // РґРѕР±Р°РІР»РµРЅРёРµ РІ РєРѕРЅРµС† СРїРёСРєР°
        System.out.println(gblist);

        gblist.remove(2); // СРґР°Р»РµРЅРёРµ СЌР»РµРјРµРЅС‚Р° РёР· СРїРёСРєР° РїРѕ РёРЅРґРµРєСС
        System.out.println(gblist);