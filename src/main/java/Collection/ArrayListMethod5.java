package Collection;

import java.util.ArrayList;

public class ArrayListMethod5 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Иван");
        arrayList1.add("Владимир");
        arrayList1.add("Дмитрий");
        arrayList1.add("Святослав");

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("Владимир");
        arrayList2.add("Дмитрий");

        // Удаляет элементы из массива 1, которые есть в массиве 2
        arrayList1.removeAll(arrayList2);
        System.out.println(arrayList1);

        System.out.println("\n===============================\n");

        // Оставляет элементы в массиве 1, которые есть в массиве 2
        arrayList1.retainAll(arrayList2);
        System.out.println(arrayList1);
    }
}
