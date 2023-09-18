package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Иван");
        arrayList1.add("Мария");
        arrayList1.add("Владимир");
        arrayList1.add("Яна");

        // с помощью итератора может вывести элементы массива
        Iterator<String> iterator = arrayList1.iterator();
        while(iterator.hasNext()){
            iterator.next();

        }
        System.out.println(arrayList1);
    }
}
